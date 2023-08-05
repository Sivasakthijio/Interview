package chatGPT;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkIsBroken {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		for(int i=0; i<=link.size();i++) {
			if(link.get(i).getAttribute("href") != null) {
				String url = link.get(i).getAttribute("href");
				URL links=null;
				try {
				links= new URL(url);
				}
				catch(MalformedURLException e){
					e.printStackTrace();
				}
				HttpURLConnection httpcon =null;
				try {
				 httpcon = (HttpURLConnection) links.openConnection();
				}
				catch(NullPointerException e) {
					e.printStackTrace();
				}
				 Thread.sleep(2000);
				 httpcon.connect();
				 
				 int resCode=httpcon.getResponseCode();
				 if(resCode>=400) {
						System.err.println(url + " is a broken link");
					} else {
						System.out.println(url + "is a link is working");
				 }
			}
		}
		driver.close();
		}

}
