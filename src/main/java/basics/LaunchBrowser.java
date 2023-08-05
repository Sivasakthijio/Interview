package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actTitle="OrangeHRM";
		String title=driver.getTitle();
		System.out.println(title);
		
		String expDash="Dashboard";
		String dash="";
		Thread.sleep(2000);
		try {
		dash=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(dash);
		
		if(dash.equals(expDash)) {
			System.out.println("*******Dash Login Successfully********");	
		}
		if(actTitle.equals(title)) {
		System.out.println("*******Login Successfully********");	
		}
		//driver.close();
		
		

	}

}
