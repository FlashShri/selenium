package testsQA;

import org.testng.annotations.Test;

import com.ModernElements.BaseClass.BaseClass;
import com.qa.PageClasses.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void runBrowser() throws InterruptedException {
		LoginPage login = new LoginPage();
		login.inputUserName();
		login.inputPassword();
		login.clickOnLogin();
		Thread.sleep(3000);
				
	}
	
}
