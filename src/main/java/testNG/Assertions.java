package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions {
	
	
	
	WebDriver driver;
	
	@Test
	public void test1() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test2() {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		WebElement logo =driver.findElement(By.xpath("//img[@alt='OrangeHRM Logo']"));
		Assert.assertTrue(logo.isDisplayed());
		
	}

}
