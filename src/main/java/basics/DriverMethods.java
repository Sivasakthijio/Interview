package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//Launching the website
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//Maximize the windows size
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		//Getting the title of windows
		System.out.println("Title of the windows: "+driver.getTitle());
		
		
		//Get the current URL
		System.out.println("Title of the URL: "+driver.getCurrentUrl());
		
		//Get window handles
		//System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//There is no duplicate thats why they are using set instead of list
		Set<String> windows = driver.getWindowHandles();
		
		for(String window:windows) {
		System.out.println(window);
		}
		
		driver.close();
		

	}

}
