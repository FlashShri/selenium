package com.qa.objectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseSetUp.BaseClass;

public class IframePage extends BaseClass {

	public IframePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//iframe[@id='thedynamichtml']")
	WebElement iframe1 ;
	@FindBy(xpath = "//iframe[@id='theheaderhtml']")
	WebElement iframe2;
	@FindBy(tagName = "ul")WebElement unolist;
	
	public void handleIframe1() throws InterruptedException {
		
		driver.switchTo().frame(iframe1);
		List<WebElement> listitems = unolist.findElements(By.tagName("li"));
		
		for(WebElement e: listitems) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
	}
	public void handleIframe2() throws InterruptedException {
		driver.switchTo().frame(iframe2);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	
}
