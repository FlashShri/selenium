package com.qa.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ModernElements.BaseClass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement 	UserNameInput;
	@FindBy(xpath = "//input[@id='password']")WebElement PasswordInput;
	@FindBy(xpath = "//input[@id='login-button']")WebElement LoginButton;
	
	
	public void inputUserName() {
		UserNameInput.sendKeys("standard_user");
	}
	public void inputPassword() {
		PasswordInput.sendKeys("secret_sauce");
	}
	public void clickOnLogin() {
		LoginButton.click();
	}
}
