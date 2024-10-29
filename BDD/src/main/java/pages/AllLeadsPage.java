package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllLeadsPage {
	@FindBy(xpath = "//input[@value='New Lead']")
	private WebElement newLeadBtn;

	public AllLeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void newLeadBtn() {
		newLeadBtn.click();
	}
}
