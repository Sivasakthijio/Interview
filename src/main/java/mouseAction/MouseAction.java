package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/starter-open-source-hr-management-software/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement platform = driver.findElement(By.xpath("//a[text()='Platform']"));
		//platform=driver.findElement(By.xpath("//a[text()='Platform']"));
		Actions act= new Actions(driver);
		act.moveToElement(platform).build().perform();
		
		WebElement people = driver.findElement(By.xpath("//body/nav[@class='navbar navbar-expand-lg navbar-light fixed-top']/div[@class='container-fluid']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav me-auto mb-2 mb-lg-0 web-menu']/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		act.moveToElement(people).build().perform();
		
		WebElement starts = driver.findElement(By.xpath("//a[text()='STARTER (Open-Source)']"));
		act.moveToElement(starts).click().build().perform();
		
		String PageTitle=driver.findElement(By.xpath("//p[text()='Free and Open Source HR Software']")).getText();
		String ActualTitle="Free and Open Source HR Software";
		if(PageTitle.equals(ActualTitle)) {
		System.out.println("Successfully mousehover done");	
		}
		Thread.sleep(2000);
		
		driver.close();
		
		
}
}