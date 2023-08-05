package chatGPT;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLinkChecker {

	public static void main(String[] args) {
        // Set up Selenium WebDriver
        
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

        // Open Amazon homepage
        driver.get("https://www.amazon.com/");

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Check if each link is broken
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href != null && isLinkBroken(href)) {
                System.out.println("Broken link: " + href);
            }
        }

        // Close the browser
        driver.quit();
    }

    private static boolean isLinkBroken(String url) {
        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            return (responseCode != HttpURLConnection.HTTP_OK);
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }}
	/*
	 * This program sends a GET request to Amazon's homepage
	 * (https://www.amazon.com/) to retrieve the HTML content of the page. It then
	 * uses a regular expression to extract all the links from the HTML content.
	 * 
	 * For each link, the program sends a HEAD request to check if the link is
	 * broken. If the response status code is 404 (Not Found), then the link is
	 * considered to be broken, and its URL is printed to the console.
	 * 
	 * Note that this program only checks if the links are broken at the moment the
	 * program is run. It's possible that some of the links could become broken or
	 * be fixed in the future, so you may want to periodically re-run the program to
	 * check the links if they are important to your application.
	 */
