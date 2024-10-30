package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import generic.WebDriverUtils;
import hooks.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountDetailsPage;
import pages.AllLeadsPage;
import pages.AllPotentialsPage;
import pages.CreateNewLeadPage;
import pages.HomePage;
import pages.LeadDetailsPage;
import pages.LeadsConversionPage;

public class ZohoCRM {
	public static WebDriver driver=BaseClass.driver;
	LeadsConversionPage l;
	public static WebDriverUtils w;
	@Given("User should be present in CRM {string}")
	public void user_should_be_present_in_crm(String page) {
		w=new WebDriverUtils();
		w.verifyTitle(page);
	}
	@When("He clicks on leads module")
	public void he_clicks_on_leads_module() {
	HomePage h=new HomePage(driver);
	h.clickLeads();
	}
	@Then("{string} page should be displayed in the browser")
	public void page_should_be_displayed_in_the_browser(String page) {
		w.verifyTitle(page);
	}
	@When("He clicks on new Lead button")
	public void he_clicks_on_new_lead_button() {
		AllLeadsPage a=new AllLeadsPage(driver);
		a.newLeadBtn();
	}
	@Then("{string} page should be displayed for a creating lead")
	public void page_should_be_displayed_for_a_creating_lead(String page) {
		w.verifyTitle(page);
	}
	
	@When("He enters the company name as {string}")
	public void he_enters_the_company_name_as(String compName) {
		CreateNewLeadPage c=new CreateNewLeadPage(driver);
		c.getCompNameTbx().sendKeys(compName);
	}
	@And("He enters the last name as {string}")
	public void he_enters_the_last_name_as(String lastname) {
		CreateNewLeadPage c=new CreateNewLeadPage(driver);
		c.getLastnameTbx().sendKeys(lastname);
	}
	@And("He clicks on save button")
	public void he_clicks_on_save_button() {
		CreateNewLeadPage c=new CreateNewLeadPage(driver);
		c.getSaveBtn().click();
	}
	@Then("{string} page should be displayed along with the lead details")
	public void page_should_be_displayed_along_with_the_lead_details(String page) {
		w.verifyTitle(page);
	}
	@When("He clicks on convert button")
	public void he_clicks_on_convert_button() {
		LeadDetailsPage l=new LeadDetailsPage(driver);
		l.setConvertBtn();
	}
	@Then("{string} page should be for converting the lead")
	public void page_should_be_for_converting_the_lead(String page) {
		w.verifyTitle(page);
	}
	@When("he enters Potential closing date as {string}")
	public void he_enters_potential_closing_date_as(String date) {
	l=new LeadsConversionPage(driver);
	l.getClosedate().sendKeys(date);
	}
	@And("he selects potential stage as negotiation")
	public void he_selects_potential_stage_as_negotiation() {
	WebElement dd = l.getProbabilityDropDown();
	Select s=new Select(dd);
	s.selectByValue("90");
	}

	@When("he clicks on save btn")
	public void he_clicks_on_save_btn() throws InterruptedException {
	l.getSaveBtn().click();
	}
	@Then("{string} page should be displayed along with account details")
	public void page_should_be_displayed_along_with_account_details(String page) {
		w.verifyTitle(page);
	}
	@When("he clicks on potential link")
	public void he_clicks_on_potential_link() {
		AccountDetailsPage a=new AccountDetailsPage(driver);
		a.clickPotentialsLink();
	}
	@Then("the company name {string} should be displayed in the {string} page")
	public void the_company_name_should_be_displayed_in_the_page(String compName, String page) {
		w.verifyTitle(page);
		AllPotentialsPage a=new AllPotentialsPage(driver);
		WebElement ele = a.getCreatedPotentialLink();
		String actualCompName = ele.getText();
		Assert.assertEquals(actualCompName,compName);
	}

}
