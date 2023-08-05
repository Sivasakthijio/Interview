package interview;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("u_0_0_Jq")).click();
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[@role='button']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Sangeetha");
		driver.findElement(By.name("lastname")).sendKeys("Raja");
		driver.findElement(By.name("reg_email__")).sendKeys("9898989776");
		driver.findElement(By.name("reg_passwd__")).sendKeys("V@#mpire@$1oo1");
		driver.findElement(By.id("birthday-help")).click();
		
		String str = driver.findElement(By.xpath("//div[@class='_9hzn']")).getText();
		System.out.println("str:---------------------->"+str);
		
		
		/*
		 * WebElement days = driver.findElement(By.id("day")); 
		 * Select s=new Select(days); 
		 * s.selectByIndex(3); 
		 * 
		 * WebElement month = driver.findElement(By.id("month")); 
		 * Select s2=new Select(days);
		 * s2.selectByIndex(3); 
		 * 
		 * WebElement year = driver.findElement(By.id("year"));
		 * Select s3=new Select(year); 
		 * s3.selectByValue("2001"); 
		 * 
		 * WebElement female = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input[@value='1']")); 
		 * female.click();
		 *///driver.findElement(By.name("websubmit")).click();
		
	
	}

}
