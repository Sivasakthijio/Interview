package basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println("Parent Window NAME"+driver.getTitle());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> I1= windows.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		
		driver.switchTo().window(child_window);

		//System.out.println(driver.switchTo().window(child_window).getTitle());

		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//button[text()='Book a Free Demo']")).click();
		}
		
		}

}
}