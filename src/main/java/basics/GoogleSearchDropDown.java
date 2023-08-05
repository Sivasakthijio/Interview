package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		//List<> options = driver.findElement(By.xpath("//ul[@jsname='bw4e9b']//li"));
		
		for(WebElement option:options) {
			String s="selenium testing";
			String opt = option.getText();
			if(opt.equals(s)) {
			option.click();
			break;
			}
			}
      // driver.close();
	}
}
