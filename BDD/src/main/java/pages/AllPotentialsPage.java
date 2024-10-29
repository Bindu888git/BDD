package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllPotentialsPage {
	@FindBy(xpath = "(//a[contains(@href,'ShowEntityInfo.')])[last()]")
	private WebElement createdPotentialLink;
	@FindBy(partialLinkText = "Logout")
	private WebElement logoutLink;

	public AllPotentialsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logout() {
		logoutLink.click();
	}
	public WebElement getCreatedPotentialLink() {
		return createdPotentialLink;
	}
}
