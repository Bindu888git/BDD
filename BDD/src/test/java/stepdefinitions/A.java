package stepdefinitions;

import hooks.BaseClass;
import io.cucumber.java.en.Given;

public class A {
	@Given("User should be present in home page")
	public void user_should_be_present_in_home_page() {
	    System.out.println("Home page is displayed");
	}
}
