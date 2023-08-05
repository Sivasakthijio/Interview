package KeyBoardAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardButtonPress {

	public static void main(String[] args) throws InterruptedException {
		
		String Esc="You entered: ESCAPE";
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("target")).click();
		Actions act= new Actions(driver);
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		String Result = driver.findElement(By.id("result")).getText();
		
		if(Esc.equals(Result)) {
			System.out.println("I clicked  "+Result);
		}
		
		
		Thread.sleep(2000);
		

	}

}
