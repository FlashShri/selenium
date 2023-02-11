package com.qa.utility;

import com.qa.baseSetUp.BaseClass;
import com.qa.objectRepository.IndexPage;

public class Util extends BaseClass  {

	
	public void gotoAlerts() throws InterruptedException {
		IndexPage ip = new IndexPage();
		ip.goToAlertPage();
		System.out.println("opened alertPage success");
		Thread.sleep(2000);
	}
	
}
