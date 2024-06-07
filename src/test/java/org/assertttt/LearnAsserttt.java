package org.assertttt;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.page.Login;
import org.test.base.BaseClassss;

public class LearnAsserttt extends BaseClassss {
	@BeforeClass
	public static void beforeClass() {
		chromeLaunch();
		impwait(10);
	}

	@AfterClass
	public static void afterClass() {
		 quit();
	}

	@Test
	//Valid
	public void test() throws InterruptedException {
		url("https:/www.facebook.com");
//	String url = getCurrentUrl();
//	boolean contains = url.contains("facebook");
//	Assert.assertTrue(contains);    
		Assert.assertTrue(getcurrentUrl().contains("facebook"));
		Login l = new Login();
		sendKeys(l.getUser(), "bagavathi1203@gmail.com");
		Assert.assertEquals("verify user", "bagavathi1203@gmail.com", getAttribute(l.getUser()));
		sendKeys(l.getPass(), "123456");
		Assert.assertEquals("verify pass", "123456", getAttribute(l.getPass()));
		click(l.getLoginbtn());
		//Assert.assertTrue(getcurrentUrl().contains("privacy_mutation_token"));
	    threadsleep(4000);
	}
	@Test
	public void test1() {
		//invalid details
		url("https:/www.facebook.com");
//	String url = getCurrentUrl();
//	boolean contains = url.contains("facebook");
//	Assert.assertTrue(contains);    
		Assert.assertTrue(getcurrentUrl().contains("facebook"));
		Login l = new Login();
		sendKeys(l.getUser(), "Bagavathi");
		Assert.assertEquals("verify user", "Bagavathi", getAttribute(l.getUser()));
		sendKeys(l.getPass(), "uvarajan");
		Assert.assertEquals("verify pass", "uvarajan", getAttribute(l.getPass()));
		click(l.getLoginbtn());
		//Assert.assertTrue(getcurrentUrl().contains("privacy_mutation_token"));
	}
}
