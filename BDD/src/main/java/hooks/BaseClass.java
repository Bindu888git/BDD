package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.AllPotentialsPage;
import pages.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	@Before(order=1)
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.61.128:8080");
		System.out.println("openBrowser");
	}	@Before(order=2)
	public void login() {
		LoginPage l=new LoginPage(driver);
		l.login("rashmi@dell.com", "123456");
		System.out.println("login");
	}	@After(order=2)
	public void logout() {
		AllPotentialsPage p=new AllPotentialsPage(driver);
		p.logout();
		System.out.println("logout");
	}	@After(order=1)
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
		System.out.println("closeBrowser");
	}
}
