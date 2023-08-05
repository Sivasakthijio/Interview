package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a[@href=\"/sspa/click?ie=UTF8&spc=MTozMzQ5MDM5ODE1MDQ3OTQ3OjE2ODc4NjA4ODI6c3BfYXRmOjIwMDc3MzUyNzI2NDk4OjowOjo&url=%2FApple-iPhone-14-128GB-Blue%2Fdp%2FB0BDK62PDX%2Fref%3Dsr_1_1_sspa%3Fcrid%3D3VI2X9197OKOJ%26keywords%3Diphone%2B14%26qid%3D1687860882%26sprefix%3Diphone%2B14%252Caps%252C395%26sr%3D8-1-spons%26sp_csd%3Dd2lkZ2V0TmFtZT1zcF9hdGY%26psc%3D1\"]")).click();
		
		

	}

}
