package com.ModernElements.BaseClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.PageClasses.LoginPage;
import com.qa.utillity.Util;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	

@Parameters ("browser")
@BeforeClass
public void setUp(String browser) throws InterruptedException {
	
	if(browser.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}else if(browser.equalsIgnoreCase("Edge")) {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}else if(browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else
	{
		System.out.println("Please enter correct browser name from 'chrome', 'firefox' and 'Edge'");
	}
	
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Thread.sleep(2000);
	
}

@BeforeMethod
public void loginSepts() throws InterruptedException {
	LoginPage login = new LoginPage();
	
	login.inputUserName();
	login.inputPassword();
	Thread.sleep(2000);
	login.clickOnLogin();
	
	
}

@AfterMethod
public void afterM() {
	System.out.println("this is after Method");
}
@AfterClass
public void tearDown() {
	driver.quit();
}
	
	
}
