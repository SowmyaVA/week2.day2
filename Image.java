package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		
		
		//to check if the image is broken
		
		
			WebElement img=driver.findElement(By.xpath("//div[@id='contentblock']//section[1]//div[2]//label"));
				
				//System.out.println("Broken img : " +img.getText());
				
				//String brokenimg=img.getText();
				
			if(img.getText().contains("Broken Image"))
				{
				System.out.print("the image is the broken image");
				}
			else
			{
			System.out.println("The image is not broken image");
			}
		
		
		//to click the image
		
		driver.findElement(By.xpath("(//div[@class='example']//img)[1]")).click();
		
		// to click the image using mouse
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("(//div[@class='example']//img)[3]")).click();
		
		
		
		
		
		
	}

}
