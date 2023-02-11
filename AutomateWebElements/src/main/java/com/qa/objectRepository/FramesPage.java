package com.qa.objectRepository;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.baseSetUp.BaseClass;

public class FramesPage extends BaseClass {

public FramesPage(){
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//frame[@name='left']")
WebElement leftFrame ;
@FindBy(xpath = "//frame[@name='middle']")
WebElement middleFrame ;
@FindBy(xpath = "//frame[@name='right']")
WebElement rightFrame ;


@FindBy(tagName = "ul")
WebElement  unorderedList;
	

	public void gotoFrame(String flag) {
		
		if(!flag.isEmpty()) {
			if(flag =="left") {
				driver.switchTo().frame(flag);
			}else if(flag =="middle") {
				driver.switchTo().frame(flag);
			}else if(flag =="right") {
				driver.switchTo().frame(flag);
			}
		}else {
			System.out.println("please inter frame position");
		}
	}
	
	public void handleLeftFrame() {
		List<WebElement> listitems = unorderedList.findElements(By.tagName("li"));
		
		for(WebElement e: listitems) {
			System.out.println(e.getText());
		}
	}

}
