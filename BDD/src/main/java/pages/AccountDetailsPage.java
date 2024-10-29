package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {
	@FindBy(linkText = "Potentials")
	private WebElement potentialsLink;

	public AccountDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickPotentialsLink() {
		potentialsLink.click();
	}
}
