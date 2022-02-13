package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//to select a value using index
		
		WebElement drpdwn1=driver.findElement(By.xpath("//select[@id='dropdown1']"));
		
		Select dropdown=new Select(drpdwn1);
		
		dropdown.selectByIndex(2);
		
		
		//to select via text
		
		WebElement drpdwn2=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		
		Select dropdown1=new Select(drpdwn2);
		
		dropdown1.selectByVisibleText("Selenium");
		
		//to select using value
		
		WebElement drpdwn3=driver.findElement(By.xpath("//select[@id='dropdown3']"));
		
		Select dropdown2=new Select(drpdwn3);
		
		dropdown2.selectByValue("3");
		
		
		//to find the number of options available in dropdown
		
		WebElement options=driver.findElement(By.xpath("//select[@class='dropdown']"));
		
		Select dropdownList=new Select(options);
		
		List<WebElement> list=dropdownList.getOptions();
		
		System.out.println("Total number of options available in the dropdown is : " +list.size());
		
		
		//need help for below two operations
		
		//to select a value
		
		driver.findElement(By.xpath("(//div[@class='example'])[6]//option[5]")).click();
		
		//to select a value from dropdown via sendkeys 
		
		
		//driver.findElement(By.xpath("(//div[@class='example'])[5]")).sendKeys("UFT/QTP");
		
		driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("UFT/QTP");
				
		
		
	}

}
