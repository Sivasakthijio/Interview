package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("9876756556");
		driver.findElement(By.xpath("//input[@aria-label=\"Full Name\"]")).sendKeys("Johncena");
		driver.findElement(By.xpath("//input[@aria-label=\"Username\"]")).sendKeys("johncena@1007");
		driver.findElement(By.xpath("//input[@aria-label=\"Password\"]")).sendKeys("Mah&^@31oop");
		driver.findElement(By.xpath("//button[@class='_acan _acao _acas _aj1-']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
	}

}
