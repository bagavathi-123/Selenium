package org.jjjunit;

import org.junit.*;
import org.page.CreateNewAccount;
import org.test.base.BaseClassss;

public class FaceBookwithRegisterPage extends BaseClassss{
	@BeforeClass
	public static void beforeClass() {
		chromeLaunch();
		url("https:/www.facebook.com");
		impwait(20);
	}

	@AfterClass
	public static void afterClass() {
		 quit();
	}
	@Test
	public void test() {
		CreateNewAccount c=new CreateNewAccount();
		click(c.getNewAccount());
		sendKeys(c.getFirstName(), "Sainya");
		sendKeys(c.getLastName(), "uvaraj");
		sendKeys(c.getEmail(),"mk@gmail.com");
		sendKeys(c.getPass1(), "abcdef123@");
		selectByIndex(c.getDay(), 4);
		selectByIndex(c.getMonth(), 5);
		selectByIndex(c.getYear(), 5);
		click(c.getGenter());
		click(c.getSignUpBtn());
	}

}
