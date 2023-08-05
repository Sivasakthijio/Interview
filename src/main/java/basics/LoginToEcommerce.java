package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToEcommerce {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(2000);
		
		System.out.println("Title Before login"+driver.getTitle());
		
		WebElement EmailInput = driver.findElement(By.id("Email"));
		EmailInput.clear();
		EmailInput.sendKeys("admin@yourstore.com");
		
		WebElement PassInput = driver.findElement(By.id("Password"));
		PassInput.clear();
		PassInput.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		
		System.out.println("Title After login"+driver.getTitle());
		
		String DashText = driver.findElement(By.xpath("//div[@class='content-header']/descendant::h1")).getText();
		
		String ExpDash= "Dashboard";
		
		if(DashText.equals(ExpDash)) {
		System.out.println("Successfully login");
			
		}
		
	}

}
