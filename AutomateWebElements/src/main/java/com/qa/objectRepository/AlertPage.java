package com.qa.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseSetUp.BaseClass;

public class AlertPage extends BaseClass{

	public AlertPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='alertexamples']")
	WebElement alertSimple ;
	
	@FindBy(xpath = "//input[@id='confirmexample']")
	WebElement alertConfirm;
	
	@FindBy(xpath = "//input[@id='promptexample']")
	WebElement alertDialog;
	
	//this elements appears after engaging the alerts
	
	@FindBy(xpath = "//p[@id='confirmreturn']")WebElement statusConfirmReturn;
	@FindBy(xpath = "//p[@id='confirmexplanation']")WebElement exConfirmReturn;
	
	@FindBy(xpath = "//p[@id='promptreturn']")WebElement statusPromtReturn;
	@FindBy(xpath = "//p[@id='promptexplanation']")WebElement exPromtReturn;
	
	
	public void clickOnSimpleAlert() {
		alertSimple.click();
		
		
	}
	public void clickOnConfirmAlert() {
		alertConfirm.click();
		
	}
	public void clickOnDialogAlert() {
		alertDialog.click();
	}
	
	
	public void handleSimpleAlert() {
		driver.switchTo().alert().accept();
	}
	
	
	public void handleConfirmAlert(boolean flag) {
		if(flag) {
			driver.switchTo().alert().accept();
			String a =statusConfirmReturn.getText();
			String b =exConfirmReturn.getText();
			
		
			System.out.println(a+" "+b);
				
		}else if(!flag) {
			driver.switchTo().alert().dismiss();
			String a =statusConfirmReturn.getText();
			String b =exConfirmReturn.getText();
			System.out.println(a+" "+b);
		}
	}
	
	public void handleDialogAlert(String inputData) {
		if(!inputData.isEmpty()) {
			driver.switchTo().alert().sendKeys(inputData);
			driver.switchTo().alert().accept();
			String a = statusPromtReturn.getText();
			String b = exPromtReturn.getText();
			System.out.println("user is : "+a+"\n"+"respose is: "+b);
		}else {
			driver.switchTo().alert().accept();
			String a = statusPromtReturn.getText();
			String b = exPromtReturn.getText();
			System.out.println("user is : "+a+"\n"+"respose is: "+b);
		
		}
	}
	
}
