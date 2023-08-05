package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsMethods {

	public static void main(String[] args) {
		//Wait statement will be to solve synchronization problem in automation
		//Thread.sleep()----->is coming from java it is not recommended to use automation will decrease application efficiency
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		//driver.manage().window().maximize();
		
		//<---------------Implicit wait------------------>
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//<---------------------Explicit wait ---------------------------->
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
		//driver.findElement(By.name("username")).sendKeys("Admin");
		

	}

}
