package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Title of the URL----------->driver.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println("Title contains --->OrangeHRM "+title.contains("OrangeHRM"));
		
		//boolean b=title.contains("OrangeHRMe")
		Assert.assertEquals(title, "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM");
		//Assert.assertTrue(false, title);
		
		//Closing opened driver this test
		driver.close();
		
		driver.quit();
		
		
	}

}
