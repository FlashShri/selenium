package com.qa.PageClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ModernElements.BaseClass.BaseClass;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@class='product_sort_container']")
	WebElement SelectEle;
	
	
	
	public void selectChoice(String str) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement selectelement = wait.until(ExpectedConditions.visibilityOf(SelectEle));
		selectelement.click();
		Select s = new Select(SelectEle);
		if(str.equalsIgnoreCase("AtoZ")) {
			s.selectByVisibleText(str);
		}else if(str.equalsIgnoreCase("ZtoA")){
			s.selectByVisibleText("Name (Z to A)");
		}else if(str.equalsIgnoreCase("LowtoHigh")){
			s.selectByVisibleText("Price (low to high)");
		}else if(str.equalsIgnoreCase("HightoLow")) {
			s.selectByVisibleText("Price (high to low)");
		}else {
			System.out.println("select proper filter option");
		}	
}
	


}
