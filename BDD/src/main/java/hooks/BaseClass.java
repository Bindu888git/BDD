package hooks;

import org.testng.annotations.AfterMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	@Before(order=2)
	public void login() {
		System.out.println("login");
	}
	@Before(order=1)
	public void openBrowser() {
		System.out.println("openBrowser");
	}	
	@After(order=1)
	public void closeBrowser() {
		System.out.println("closeBrowser");
	}
	@After(order=2)
	public void logout() {
		System.out.println("logout");
	}
}
