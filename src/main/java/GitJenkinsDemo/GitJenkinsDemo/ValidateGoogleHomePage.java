package GitJenkinsDemo.GitJenkinsDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateGoogleHomePage {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}	
		@Test
		public void validateHomePage()
		{
			driver.findElement(By.id("APjFqb")).sendKeys("Numpy Ninja Company");
			driver.findElement(By.name("btnK")).click();
			driver.getTitle();
		}
		
		@AfterTest
		public void teardown()
		  {
			driver.close();
		  }
		
		
	}

