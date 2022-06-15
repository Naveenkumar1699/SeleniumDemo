package pk_orangeHrm_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hdfclogin {

	WebDriver driver;

	@Test
	public void Login() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);

		WebElement input = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));

		input.sendKeys("10987");

		driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();

		String view = driver.findElement(By.xpath("//span[normalize-space()='Password/ IPIN']")).getText();

		System.out.println(view);
	}

}
