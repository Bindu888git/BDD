package generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import hooks.BaseClass;

public class WebDriverUtils {
	WebDriver driver=BaseClass.driver;
	public void verifyTitle(String expectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(expectedTitle));
		String actualTitle = driver.getTitle();
		boolean res = actualTitle.contains(expectedTitle);
		Assert.assertTrue(res, "The mentioned webpage is not displayed");
	}
}
