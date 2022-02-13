package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText 

{

	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to find the number of links in the webpage
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		System.out.println("Total number of links in the WebPage : " +links.size());
		
		//to find which page the link is going without  clicking the link
		
		
		WebElement link=driver.findElement(By.xpath("//div[@id='contentblock']//section[1]//div[2]//a"));
		
		System.out.println(link.getAttribute("href"));
		
		//to verify if the link is broken
		
		
		driver.findElement(By.xpath("//div[@id='contentblock']//section[1]//div[3]//a")).click();
		
		System.out.println("Page Title " +driver.getTitle());
		
		System.out.println("Current URL " +driver.getCurrentUrl());
		
		if(driver.getTitle().contains("HTTP Status 404"))
		{
			System.out.println("The link is broken");
		}
		else
		{
			System.out.println("The link is not broken");
		}
		
		
		
		
		
		
	}
	
	
}
