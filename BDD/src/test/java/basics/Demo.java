package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.61.128:8080");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		driver.findElement(By.name("property(Company)")).sendKeys("IBM");
		driver.findElement(By.name("property(Last Name)")).sendKeys("Gandhi");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		driver.findElement(By.xpath("//input[@value='Convert']")).click();
		driver.findElement(By.name("closedate")).sendKeys("11/14/2024");
		WebElement probability = driver.findElement(By.name("probability"));
		Select s=new Select(probability);
		s.selectByValue("90");
		driver.findElement(By.name("save")).click();
		driver.findElement(By.linkText("Potentials")).click();
String text = driver.findElement(By.xpath("(//a[contains(@href,'ShowEntityInfo.')])[last()]")).getText();
		System.out.println(text);
	}
}