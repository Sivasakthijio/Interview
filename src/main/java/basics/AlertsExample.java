package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String alert = "You successfully clicked an alert";
		String alert1 = "You clicked: Ok";
		String alert2 = "You clicked: Cancel";
		String alert3 = "You entered: sivasakthi";
		String alert4 = "You entered: null";
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// ***************Normal Alert**********
		// driver.findElement(By.xpath("//button[text()='Click for JS
		// Alert']")).click();
		// Alert Alertwindow = driver.switchTo().alert();
		// Alertwindow.accept();

		// ***************Confirm Alert**********
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); Alert Alertwindow = driver.switchTo().alert(); Alertwindow.accept();
		 * Alertwindow.dismiss();
		 * 
		 */

		// **************Nameprompt alertClick for JS Prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert Alertwindow = driver.switchTo().alert();
		Thread.sleep(5000);
		Alertwindow.sendKeys("sivasakthi");
		Thread.sleep(5000);
		// Alertwindow.accept();
		Alertwindow.dismiss();

		WebElement result = driver.findElement(By.id("result"));
		String ResultText = result.getText();

		if (ResultText.equals(alert)) {
			System.out.println("Normal alert  " + ResultText);
		} else if (ResultText.equals(alert1)) {
			System.out.println("Normal alert with Ok  " + ResultText);
		} else if (ResultText.equals(alert2)) {
			System.out.println("Normal alert with Cancel  " + ResultText);
		} else if (ResultText.equals(alert3)) {
			System.out.println("Normal alert with name  " + ResultText);
		} else if (ResultText.equals(alert4)) {
			System.out.println("Normal alert with name cancel " + ResultText);
		} else {
			System.out.println("Wrong program");
		}

		driver.close();
	}

}
