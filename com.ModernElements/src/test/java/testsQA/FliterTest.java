package testsQA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ModernElements.BaseClass.BaseClass;
import com.qa.PageClasses.HomePage;

public class FliterTest extends BaseClass {

	@Test
	public void selectAsAtoZ() throws InterruptedException {
		HomePage homepage = new HomePage();
		homepage.selectChoice("ZtoA");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> listitems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		
		for (WebElement webElement : listitems) {
			System.out.println(webElement.getText());
		}
		Thread.sleep(2000);
	}
	
	
}
