package mouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClickAction1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//*********************RightClick Action************************
		WebElement siva = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(siva).build().perform();
		
		//*********************double click Action on mouse************************
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		act.doubleClick(copy).build().perform();
		
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();

	}

}
