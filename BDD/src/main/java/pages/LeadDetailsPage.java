package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailsPage {
	@FindBy(xpath = "//input[@value='Convert']")
	private WebElement convertBtn;

	public LeadDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setConvertBtn() {
		convertBtn.click();
	}
}
