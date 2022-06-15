package pk_orangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest_loginTest {
	ChromeDriver driver;

	@Test
	public void Login_Check() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		driver.findElement(By.linkText("Order"));

		driver.findElement(By.id("ctl00_logout")).click();

	}

	@BeforeTest
	public void LaunchBrowser() {

		// Launch Chrome
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Enter URL
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}

	@AfterTest
	public void CloseBrowser() {
		// Close Browser
		driver.quit();
	}
}