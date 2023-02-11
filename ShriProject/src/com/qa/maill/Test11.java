package com.qa.maill;

import java.time.Duration;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class Test11 {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\jar\\webdriver\\chromedriver.exe");
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	public void testCase() {
		String actTitle=driver.getTitle();
		String ExpectTitle = "fedffffdsf";
		
		Assert.assertEquals(actTitle, ExpectTitle);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
