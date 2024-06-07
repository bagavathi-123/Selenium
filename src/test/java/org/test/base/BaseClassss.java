package org.test.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassss {
	public static WebDriver driver;
public static void chromeLaunch() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
}
public static void edgeBrowser() {
driver=new EdgeDriver();
}
public static void url(String Url) {
	driver.get(Url);
}
public static void navigateTo(String url) {
	driver.navigate().to(url);
}
public static void back() {
	driver.navigate().back();
}
public static void forward() {
	driver.navigate().forward();
}
public static void refresh() {
	driver.navigate().refresh();
}
public static boolean isDisplayed(WebElement e) {
	boolean displayed = e.isDisplayed();
	return displayed;
}
public static boolean isEnabled(WebElement e) {
	boolean enabled = e.isEnabled();
	return enabled;
}
public static boolean isSelected(WebElement e) {
	boolean selected = e.isSelected();
	return selected;

}
public static void impwait(int sec) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	driver.manage().window().maximize();
}	
public static void sendKeys(WebElement e,String data) {
	e.sendKeys(data);
}	
public static void click(WebElement e) {
	e.click();
}	
public static void clear(WebElement e) {
	e.clear();
}
	
public static void quit() {
	 driver.quit();

}	
public static void threadsleep(int sec)  {
	try {
		Thread.sleep(sec*1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
public static String getcurrentUrl() {
	 String url = driver.getCurrentUrl();
	return url;
}
public static String getAttribute(WebElement e) {
	String attribute = e.getAttribute("value");
	return attribute;

}
	
public static void moveToElement(WebElement e) {
	Actions a=new Actions(driver);
    a.moveToElement(e).perform();
}
public static void dragAndDrop(WebElement from,WebElement to) {
	Actions a=new Actions(driver);
	a.dragAndDrop(from , to).perform();
}	
public static void clickAndHold(WebElement e) {
	Actions a=new Actions(driver);
	a.clickAndHold(e).perform();
}
public static void doubleClick(WebElement e) {
	Actions a=new Actions(driver);
	a.doubleClick(e).perform();
}	
public static void contextClick(WebElement e) {
	Actions a=new Actions(driver);
	a.contextClick(e).perform();
}
public static void release(WebElement e) {
	Actions a=new Actions(driver);
	a.release(e).perform();

}	
public static void simpleAlert() {
	Alert a = driver.switchTo().alert();
    a.accept();
}
public static void confirmAlert(int num) {
	Alert a = driver.switchTo().alert();
	if (num == 0) {
		a.accept();
	}else {
		a.dismiss();
	}
}	
public static void promptAlert(int num,String e) {
	Alert a = driver.switchTo().alert();
	if (num == 0) {
		a.accept();
	}else if(num == 1) {
		a.dismiss();
	}else {
		a.sendKeys(e);
	}
}	
public static void selectByIndex(WebElement e,int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
}
public static void selectByVisibleText(WebElement e,String text) {
	Select s=new Select(e);
	s.selectByVisibleText(text);
}
public static void selectByValue(WebElement e,String value) {
	Select s=new Select(e);
   s.selectByValue(value);
}	
public static void deselectAll(WebElement e) {
	Select s=new Select(e);
	s.deselectAll();
}
public static void deselectByIndex(WebElement e,int index) {
	Select s=new Select(e);
	s.deselectByIndex(index);
	
}	
public static void deselectByValue(WebElement e,String value) {
	Select s=new Select(e);
	s.deselectByValue(value);
}		
public static void deselectByVisibleText(WebElement e,String text) {
	Select s=new Select(e);
	s.deselectByVisibleText(text);
}
public static boolean isMultible(WebElement e ) {
	Select s=new Select(e);
	boolean mul = s.isMultiple();
	return mul;
}
public static void allOption(WebElement e) {
	Select s=new Select(e);
	List<WebElement> alloption = s.getAllSelectedOptions();
	for (int i = 0; i < alloption.size(); i++) {
		String oplist = alloption.get(i).getText();
}
}
public static void screenshot(String filename) throws IOException {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File from = tk.getScreenshotAs(OutputType.FILE);
	File to=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\snaps\\"+filename+".png");
	FileUtils.copyFile(from, to);
}
public static void jsSendKey(String data,WebElement e) {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('value','"+data+"')", e);
}
public static void jsClick(WebElement e) {
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()",e);
}
public static String jsgetAttribute(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	 Object obj = js.executeScript("return arguments[0].getAttribute('value')", e);
	 String s = obj.toString();
	return s;
}
public static void scrollDown(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].scrollIntoView(true)", e);
}
public static void scrollUp(WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", e);
}
public static void windowHandles(int index) {
	Set<String> window = driver.getWindowHandles();
	List<String> list=new ArrayList<String>(window);
	driver.switchTo().window(list.get(index));

}
public static void frameid(String  id) {
	driver.switchTo().frame(id);
}
public static void framename(String  name) {
	driver.switchTo().frame(name);
}
public static void frameweb(WebElement e) {
	driver.switchTo().frame(e);
}
public static void frameindex(int index) {
	driver.switchTo().frame(index);
}
public static void parentFrame() {
	driver.switchTo().parentFrame();
}
public static void outOfAllFrame() {
driver.switchTo().defaultContent();
}
public static void close() {
driver.close();
}



	
}
