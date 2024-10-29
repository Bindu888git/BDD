package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(linkText = "Leads")
private WebElement leadsLink;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void clickLeads() {
	leadsLink.click();
}
}
