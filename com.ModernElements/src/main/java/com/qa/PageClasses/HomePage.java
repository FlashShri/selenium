package com.qa.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ModernElements.BaseClass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement SelectEle;
	
	public void selectHandle() {
		Select s = new Select(SelectEle);
		s.deselectByVisibleText("Name (A to Z)");
	}
	
	
	
}
