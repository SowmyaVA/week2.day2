package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://acme-test.uipath.com/login");
		
		//to manage size of window
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//to enter email  id
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		
		//to enter password
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
		
		//to click submit button
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary' and @type='submit']")).click();
		
		Thread.sleep(2000);
		
		//to get the header of the page
		
		WebElement page=driver.findElement(By.xpath("//h1[@class='page-header']"));
		
		System.out.println("Page Header is : " + page.getText());
		
		//to get the title
		
		System.out.println("Title is : " +driver.getTitle());
		
		//to close the browser
		
		driver.close();
	}

}
