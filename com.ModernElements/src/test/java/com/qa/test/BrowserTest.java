package com.qa.test;


import org.testng.annotations.Test;

import com.ModernElements.BaseClass.BaseClass;

public class BrowserTest extends BaseClass{

	@Test
	public void runBrowser() {
		System.out.println("browser launched");
		System.out.println(driver.getCurrentUrl());
	}
	
	
}
