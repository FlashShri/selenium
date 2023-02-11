package com.qa.utillity;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.ModernElements.BaseClass.BaseClass;

public class Util extends BaseClass {

	String path = "C:\\Users\\shrik\\git\\selenium\\com.ModernElements\\Screenshots\\";
	
	public void takeScreenShots(String filename) {
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
		
	}
}
