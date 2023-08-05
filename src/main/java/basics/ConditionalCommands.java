package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
		//isDisplayed,isEnabled,isSelected
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//boolean Bvalue = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		
		//System.out.println(Bvalue);
		
		//WebElement malecheck = driver.findElement(By.xpath("//label[@for='gender-male']"));
		WebElement malecheck = driver.findElement(By.id("gender-male"));
		malecheck.click();
		System.out.println("Male checkbox"+malecheck.isSelected());
		
		//WebElement Femalecheck = driver.findElement(By.xpath("gender-female"));
		WebElement Femalecheck = driver.findElement(By.id("gender-female"));
		System.out.println("Female checkbox"+Femalecheck.isSelected());
		
		driver.close();
		}

}
