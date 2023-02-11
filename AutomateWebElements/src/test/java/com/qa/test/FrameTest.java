package com.qa.test;

import org.testng.annotations.Test;

import com.qa.baseSetUp.BaseClass;
import com.qa.objectRepository.FramesPage;
import com.qa.objectRepository.IndexPage;

public class FrameTest extends BaseClass {

@Test(priority = 5)
public void testLeftframe() throws InterruptedException {
	IndexPage ip =new IndexPage();
	ip.goToFrames();
	Thread.sleep(2000);
	FramesPage frames = new FramesPage();
	frames.gotoFrame("left");
	Thread.sleep(2000);
	// get the list if li on frame
	frames.handleLeftFrame();
	Thread.sleep(5000);
}

@Test(priority = 6)
public void testMiddleFrame() throws InterruptedException {
	IndexPage ip =new IndexPage();
	ip.goToFrames();
	Thread.sleep(2000);
	FramesPage frames = new FramesPage();
	frames.gotoFrame("middle");
	Thread.sleep(2000);
	// get the list if li on frame
	frames.handleLeftFrame();
	Thread.sleep(5000);
}

@Test(priority = 7)
public void testRightFrame() throws InterruptedException {
	IndexPage ip =new IndexPage();
	ip.goToFrames();
	Thread.sleep(2000);
	FramesPage frames = new FramesPage();
	frames.gotoFrame("right");
	Thread.sleep(2000);
	// get the list if li on frame
	frames.handleLeftFrame();
	Thread.sleep(2000);
}
	
}
