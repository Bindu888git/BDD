package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeadsConversionPage {
	@FindBy(name = "closedate")
	private WebElement closedate;
	@FindBy(name = "probability")
	private WebElement probabilityDropDown;
	@FindBy(name = "save")
	private WebElement saveBtn;

	public LeadsConversionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getClosedate() {
		return closedate;
	}

	public WebElement getProbabilityDropDown() {
		return probabilityDropDown;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
}
