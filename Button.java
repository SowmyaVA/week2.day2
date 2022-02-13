package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		
		//to find the position of the button
		
		System.out.println("Position of the button is : "+driver.findElement(By.xpath("//button[@id='position']")).getLocation());
		
		
		//to find the color of the button
		
		
		System.out.println("Color of the button is : " +driver.findElement(By.xpath("//button[@id='color']")).getCssValue("background-color"));
		
		//to get size of the button
		
		
		System.out.println("Size of the button is : " +driver.findElement(By.xpath("//button[@id='size']")).getSize());
		//to click the button
		
		driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		
		
		//to close
		
		driver.close();
		
		
	}
	
	
}
