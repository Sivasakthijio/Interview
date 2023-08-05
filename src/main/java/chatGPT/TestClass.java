package chatGPT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Listeners(chatGPT.TestListener.class)
public class TestClass {
	
	//WebDriverManager.Chromedriver().setup();
	public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    }

    @Test
    public void test() {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("btnK")).click();
        Assert.assertTrue(driver.getTitle().contains("Selenium"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
