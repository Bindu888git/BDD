package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActitimeLogin {
	WebDriver driver;
	@Given("User should enter {string} in the browser")
	public void user_should_enter_in_the_browser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	@When("He enters valid username as {string}")
	public void he_enters_valid_username_as(String un) {
		driver.findElement(By.id("username")).sendKeys(un);
	}

	@And("he enters valid password as {string}")
	public void he_enters_valid_password_as(String pwd) {
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

	@And("he clicks on login button")
	public void he_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("Actitime home page should be displayed")
	public void actitime_home_page_should_be_displayed() {
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
