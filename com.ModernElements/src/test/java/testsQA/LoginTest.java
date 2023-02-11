package testsQA;

import org.testng.annotations.Test;

import com.ModernElements.BaseClass.BaseClass;
import com.qa.PageClasses.LoginPage;
import com.qa.utillity.Util;

public class LoginTest extends BaseClass {

	@Test
	public void runBrowser() throws InterruptedException {
		LoginPage login = new LoginPage();
		Util u = new Util();
		login.inputUserName();
		login.inputPassword();
		u.takeScreenShots("login_with_Valid_Input_1_");
		login.clickOnLogin();
		Thread.sleep(2000);
		u.takeScreenShots("login_with_Valid_Input_2_");
		
				
	}
	
}
