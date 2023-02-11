package com.qa.objectRepository;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseSetUp.BaseClass;

public class IndexPage extends BaseClass {
	
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}
	
	//locating Elements
	
	@FindBy(xpath = "//a[@id='alerttest']")
	WebElement alertTab;

	@FindBy(xpath = "//a[@id='framestest']")
	WebElement frameTab;
	
	@FindBy(xpath = "//a[@id='iframestest']")
	WebElement iframeTab;
	
	public void goToAlertPage() {
		alertTab.click();
	}
	public void goToFrames() {
		frameTab.click();
	}
	public void gotoIFrames() {
		iframeTab.click();
	}
}
