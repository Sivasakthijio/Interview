package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromesearch {

	public static void main(String[] args) {
		String exp="selenium";
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*
		 * driver.switchTo().frame(0);
		 * driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		 * driver.switchTo().de
		 */driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='erkvQe']//ul[@jsname='bw4e9b']//li"));
		//driver.findElement(By.xpath("//div[@class='mkHrUc']//ul[@jsname=\"bw4e9b\"]//li[1]")).click();
		
		  for(WebElement l:list) {
			  System.out.println(l.getText());
		  if(l.getText().equals(exp)) {
			  System.out.println("ifelse");
			  l.click(); 
			  break;
			  } 
		  }
		 
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();

	}

}
