package com.qa.test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.baseSetUp.BaseClass;
import com.qa.objectRepository.AlertPage;
import com.qa.objectRepository.IndexPage;
import com.qa.utility.Util;

public class AlertTest extends BaseClass {

	
	
	

//	public void verifyUrl() {
//		
//		String expectedUrl = "https://testpages.herokuapp.com/styled/index.html";
//		String actualURl = driver.getCurrentUrl();
//		Assert.assertEquals(expectedUrl, actualURl);
//		System.out.println("Url Launched success");
//	}
	
	@Test(priority = 0)
	public void TestALerts() throws InterruptedException {
		IndexPage ip =new IndexPage();
		ip.goToAlertPage();
		AlertPage ap =  new AlertPage();
		ap.clickOnSimpleAlert();
		Thread.sleep(2000);
		ap.handleSimpleAlert();
		Thread.sleep(2000);
		
		
		
	}
	
	@Test(priority = 1)
	public void testConfirmAlert() throws InterruptedException {
		IndexPage ip =new IndexPage();
		ip.goToAlertPage();
		AlertPage ap =  new AlertPage();
		ap.clickOnConfirmAlert();
		Thread.sleep(2000);
		//set flag to true to accept confirm alert and return the new appearing element
		ap.handleConfirmAlert(true);
		Thread.sleep(2000);
		
	}
	
	
	@Test(priority = 2)
	public void testPromtAlert() throws InterruptedException {
		IndexPage ip =new IndexPage();
		ip.goToAlertPage();
		AlertPage ap =  new AlertPage();
		ap.clickOnDialogAlert();
		Thread.sleep(2000);
		ap.handleDialogAlert("HEllO From JAVA");
		Thread.sleep(2000);
		
	}
	
}
