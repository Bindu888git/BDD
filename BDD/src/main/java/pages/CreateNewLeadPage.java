package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {
	@FindBy(name = "property(Company)")
	private WebElement compNameTbx;
	@FindBy(name = "property(Last Name)")
	private WebElement lastnameTbx;
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCompNameTbx() {
		return compNameTbx;
	}
	public WebElement getLastnameTbx() {
		return lastnameTbx;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
}
