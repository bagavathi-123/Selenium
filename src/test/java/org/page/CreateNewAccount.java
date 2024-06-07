package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.BaseClassss;

public class CreateNewAccount extends BaseClassss {
	public CreateNewAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Create new account")
	private WebElement newAccount;
	@FindBy(name = "firstname")
	private WebElement firstName;

	@FindBy(name = "lastname")
	private WebElement lastName;

	@FindBy(name = "reg_email__")
	private WebElement email;
	@FindBy(id = "password_step_input")
	private WebElement pass1;
	@FindBy(id = "day")
	private WebElement day;
	@FindBy(id = "month")
	private WebElement month;
	@FindBy(id = "year")
	private WebElement year;
	@FindBy(xpath = "//input[@value='1']")
	private WebElement genter;
	@FindBy(name = "websubmit")
	private WebElement signUpBtn;

	public WebElement getNewAccount() {
		return newAccount;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass1() {
		return pass1;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGenter() {
		return genter;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

}