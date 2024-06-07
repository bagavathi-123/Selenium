package org.jjjunit;

import java.util.Date;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.base.BaseClassss;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook extends BaseClassss {
     public static  WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver =new ChromeDriver();
	  
	}
    @AfterClass
     public static void afterClass() {
		driver.quit();
	}
    @Before
    public void before() {
		Date d=new Date();
		System.out.println("before    "+d);
	}
    @After
    public void after() {
    	Date d=new Date();
		System.out.println("after    "+d);		
	}
    @Test//positive scenerio
    public void test() {
    	driver.get("https:/www.facebook.com");
    	WebElement user = driver.findElement(By.id("email"));
    	sendKeys(user, "bagavathi1203@gmail.com");
		WebElement pas = driver.findElement(By.id("pass"));
	    sendKeys(pas, "1234567");
	    WebElement loginbtn = driver.findElement(By.name("login"));
        click(loginbtn);
	}
    @Test
    //negative scenario
    public void test1() {
    	driver.get("https:/www.facebook.com");
    	WebElement user = driver.findElement(By.id("email"));
    	sendKeys(user, "bagavathi1203@gmail.com");
		WebElement pas = driver.findElement(By.id("pass"));
	    sendKeys(pas, "1234567");
	    WebElement loginbtn = driver.findElement(By.name("logi"));
        click(loginbtn);
	}
}
