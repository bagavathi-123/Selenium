package org.adactin;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.test.base.BaseClassss;

public class LearnAdactinHotel extends BaseClassss {
	@BeforeClass
	public static void beforeClass() {
		chromeLaunch();
		url("https://adactinhotelapp.com/");
		impwait(10);

	}
	@AfterClass
	public static void afterClass() {
//		quit();

	}
	@Test
	public void test1() {
		 WebElement user = driver.findElement(By.id("username"));
	       user.sendKeys("EswariRajan");
	       WebElement pass = driver.findElement(By.id("password"));
	       pass.sendKeys("eswari");
	       WebElement loginbtn = driver.findElement(By.id("login"));
	       loginbtn.click();
	}
	@Test
	public void test2() throws InterruptedException {
		 WebElement loc = driver.findElement(By.id("location"));
	       loc.click();
	       Select s =new Select(loc);
	       s.selectByVisibleText("Melbourne");
	       WebElement hot = driver.findElement(By.id("hotels"));
	       hot.click();
	       Select s1 =new Select(hot);
	        s1.selectByValue("Hotel Sunshine");
	        WebElement room = driver.findElement(By.id("room_type"));
	        room.click();
	        Select s2 =new Select(room);
	        s2.selectByIndex(1);
	        WebElement noofroom = driver.findElement(By.id("room_nos"));
	        noofroom.click();
	        Select s3=new Select(noofroom);
	        s3.selectByIndex(1);
	        WebElement datepic = driver.findElement(By.id("datepick_in"));
	        datepic.clear();
	        datepic.sendKeys("31/6/2024");
	        WebElement picout = driver.findElement(By.id("datepick_out"));
	        picout.clear();
	        picout.sendKeys("3/7/2024");
	        WebElement adultroom = driver.findElement(By.id("adult_room"));
	        adultroom.click();
	        Select s4=new Select(adultroom);
	        s4.selectByIndex(1);
	        WebElement search = driver.findElement(By.id("Submit"));
	        search.click();
	        
	}
	@Test
	public void test3() throws InterruptedException {
		 WebElement selec = driver.findElement(By.id("radiobutton_0"));
	        selec.click();
	        WebElement conti = driver.findElement(By.id("continue"));
	        conti.click();
          
	}
	@Test
	public void test4() {
		WebElement firstn = driver.findElement(By.id("first_name"));
        firstn.sendKeys("Leelavathi");
        WebElement lastn = driver.findElement(By.id("last_name"));
        lastn.sendKeys("KrishnaRao");
        WebElement addr = driver.findElement(By.id("address"));
         addr.sendKeys("9/256,potti meenakchi amman lane,manamadurai");
         WebElement credit = driver.findElement(By.id("cc_num"));
         credit.sendKeys("1234567891234567");
         WebElement cardtype = driver.findElement(By.id("cc_type"));
         Select s5=new Select(cardtype);
         s5.selectByIndex(2);
         WebElement month = driver.findElement(By.id("cc_exp_month"));
         Select s6=new Select(month);
         s6.selectByIndex(2);
         WebElement year = driver.findElement(By.id("cc_exp_year"));
         Select s7=new Select(year);
         s7.selectByVisibleText("2024");
         WebElement cvv = driver.findElement(By.id("cc_cvv"));
         cvv.sendKeys("123");
         WebElement book = driver.findElement(By.id("book_now"));
         book.click();
	}

}
