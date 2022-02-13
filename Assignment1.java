package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		
		//to load facebook URL
		
		driver.get("https://en-gb.facebook.com/");
		
		//sleep function
		
		Thread.sleep(2000);
		
		// to maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on create new account
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		// to input first name
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ABC");
		
		// to input last name
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("XYZ");
		
		//to input mobile number
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("12345 67891");
		
		//to input password
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Sweety@123");
		
		//to input day
		
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select chooseDay=new Select(day);
		
		chooseDay.selectByIndex(4);
		
		//to choose month
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select chooseMonth=new Select(month);
		
		chooseMonth.selectByIndex(2);
		
		//to choose year
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select chooseYear=new Select(year);
		
		chooseYear.selectByIndex(25);
		
		//to choose sex
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click();
				
		
		
	}

}
