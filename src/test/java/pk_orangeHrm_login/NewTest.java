package pk_orangeHrm_login;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {

	WebDriver driver;

	@Test
	public void sphree() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.spreecommerce.org/");

		driver.manage().window().maximize();

		String ExpTitle_Title = "Homepage (English) - Spree Demo Site";
		String ActTile_Title = driver.getTitle();

		System.out.println(ActTile_Title);
		Assert.assertEquals(ActTile_Title, ExpTitle_Title);

		String ExpURL_URL = "https://demo.spreecommerce.org/";
		String ActURL_URL = driver.getCurrentUrl();

		System.out.println(ActURL_URL);

		Assert.assertEquals(ActURL_URL, ExpURL_URL);

		// next page

		driver.findElement(By.linkText("WOMEN")).click();

		String ExpTitle_Title1 = "Women - Spree Demo Site";
		String ActTile_Title1 = driver.getTitle();

		System.out.println(ActTile_Title1);

		Assert.assertEquals(ActTile_Title1, ExpTitle_Title1);

		String ExpURL_URL1 = "https://demo.spreecommerce.org/t/categories/women";
		String ActURL_URL1 = driver.getCurrentUrl();

		System.out.println(ActURL_URL1);
		Assert.assertEquals(ActURL_URL1, ExpURL_URL1);

	}

}