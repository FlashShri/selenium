package com.qa.test;

import org.testng.annotations.Test;

import com.qa.baseSetUp.BaseClass;
import com.qa.objectRepository.IframePage;
import com.qa.objectRepository.IndexPage;

public class IframeTest extends BaseClass {

	
	
	@Test(priority = 3)
	public void testIframe1() throws InterruptedException {
		Thread.sleep(2000);
		IndexPage ip = new IndexPage();
		ip.gotoIFrames();
		Thread.sleep(2000);
		IframePage ifp =new IframePage();
		ifp.handleIframe1();
	}
	
	@Test(priority = 4)
	public void testIframe2() throws InterruptedException {
		Thread.sleep(2000);
		IndexPage ip = new IndexPage();
		ip.gotoIFrames();
		Thread.sleep(2000);
		IframePage ifp =new IframePage();
		ifp.handleIframe2();
	}
	
}
