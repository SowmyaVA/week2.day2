package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields 

{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		
		// to input email id
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		
		//sleep
		
		Thread.sleep(2000);
		
		//to append a value
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("New Text",Keys.TAB);
		
		//to get the text entered
		
		WebElement usrName=driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		System.out.println("Default value entered is :"+usrName.getAttribute("value"));
		
		//to clear the text
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//to check if the element is disabled or not
		
		Boolean disableElement=driver.findElement(By.xpath("(//div[@class='example'])[5]//input[@type='text']")).isEnabled();
		
		if(!disableElement)
		{
			System.out.println("The element is disabled");
		}
		else
		{
			System.out.println("The element is enabled");
		}
		
		
		
		
	}
	

}
