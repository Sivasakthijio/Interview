package interview;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		String exp="India";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		//WebElement frame = driver.findElement(By.xpath("//div[@class='vQ43Ie']"));
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@jsname='ZUkOIc']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[text()='Use another account']")).click();
		Set<String> windows = driver.getWindowHandles(); //
		for(String win:windows) {
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Gmail: Private and secure email at no cost | Google Workspace")) {
				driver.findElement(By.xpath("//div[@class='header__aside']//span[text()='Create an account']")).click();
			}
		}
		
		
		
		

	}

}
