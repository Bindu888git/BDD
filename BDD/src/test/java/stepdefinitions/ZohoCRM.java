package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	@Given("User should be present in CRM Home page")
	public void user_should_be_present_in_crm_home_page() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	@When("He clicks on leads module")
	public void he_clicks_on_leads_module() {try{
		Thread.sleep(1000);
	}catch (Exception e) {	}
		HomePage h=new HomePage(driver);
		h.clickLeads();
	}
	@Then("Leads Page should be displayed")
	public void leads_page_should_be_displayed() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	@When("He clicks on new Lead button")
	public void he_clicks_on_new_lead_button() {
		AllLeadsPage a=new AllLeadsPage(driver);try{
			Thread.sleep(1000);
		}catch (Exception e) {		}
		a.newLeadBtn();
	}
	@Then("Create Lead page should be displayed")
	public void create_lead_page_should_be_displayed() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	@When("He enters the company name as {string}")
	public void he_enters_the_company_name_as(String compName) {
		CreateNewLeadPage c=new CreateNewLeadPage(driver);try{
			Thread.sleep(1000);
		}catch (Exception e) {		}
		c.getCompNameTbx().sendKeys(compName);
	}
	@And("He enters the last name as {string}")
	public void he_enters_the_last_name_as(String lastname) {
		CreateNewLeadPage c=new CreateNewLeadPage(driver);try{
			Thread.sleep(1000);
		}catch (Exception e) {		}
		c.getLastnameTbx().sendKeys(lastname);
	}
	@And("He clicks on save button")
	public void he_clicks_on_save_button() {
		CreateNewLeadPage c=new CreateNewLeadPage(driver);try{
			Thread.sleep(1000);
		}catch (Exception e) {		}
		c.getSaveBtn().click();
	}
	@Then("Lead details page should be displayed")
	public void lead_details_page_should_be_displayed() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	@When("He clicks on convert button")
	public void he_clicks_on_convert_button() {
		LeadDetailsPage l=new LeadDetailsPage(driver);try{
			Thread.sleep(1000);
		}catch (Exception e) {		}
		l.setConvertBtn();
	}
	@Then("Leads Conversion page should be displayed")
	public void leads_conversion_page_should_be_displayed() {try{
		Thread.sleep(1000);
	}catch (Exception e) {		}
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	@When("he enters Potential closing date as {string}")
	public void he_enters_potential_closing_date_as(String date) {try{
		Thread.sleep(1000);
	}catch (Exception e) {		}
		l=new LeadsConversionPage(driver);
		l.getClosedate().sendKeys(date);
	}
	@And("he selects potential stage as negotiation")
	public void he_selects_potential_stage_as_negotiation() {try{
		Thread.sleep(1000);
	}catch (Exception e) {		}
		WebElement dd = l.getProbabilityDropDown();
		Select s=new Select(dd);
		s.selectByValue("90");
	}

	@When("he clicks on save btn")
	public void he_clicks_on_save_btn() throws InterruptedException {try{
		Thread.sleep(1000);
	}catch (Exception e) {		}
		l.getSaveBtn().click();
		Thread.sleep(5000);
	}
	@Then("account details page should be displayed")
	public void account_details_page_should_be_displayed() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	}
	@When("he clicks on potential link")
	public void he_clicks_on_potential_link() {
		AccountDetailsPage a=new AccountDetailsPage(driver);try{
			Thread.sleep(1000);
		}catch (Exception e) {		}
		a.clickPotentialsLink();
	}
	@Then("the potential link should be displayed in the potential list")
	public void the_potential_link_should_be_displayed_in_the_potential_list() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);try{
			Thread.sleep(1000);
		}catch (Exception e) {		}
		AllPotentialsPage a=new AllPotentialsPage(driver);
		WebElement ele = a.getCreatedPotentialLink();
		String actualCompName = ele.getText();
		System.out.println(actualCompName);
	}

}
