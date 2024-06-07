package org.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.test.base.BaseClassss;

public class Login extends BaseClassss{
	public Login() {
	PageFactory.initElements(driver, this);
	
	}
@FindBy(id="email")
private WebElement user;
@FindBy(id="pass")
private WebElement pass;

@FindBy(name="login")
private WebElement loginbtn;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getLoginbtn() {
	return loginbtn;
}


}