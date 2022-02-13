package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		
		//to click the languages you know
		
		//java
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		//SQL
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		
		
		//to see if a checkbox is selected
		
		WebElement chkBox=driver.findElement(By.xpath("//div[text()='Selenium']//input"));
		
		if(chkBox.isSelected())
		{
			System.out.println("Selenium Check box is slected");
		}
		else
		{
			System.out.println("Selenium Check box is not slected");
		}
		
		//to deselect only the checked box
		
		WebElement selected=driver.findElement(By.xpath("//div[text()='I am Selected']//input"));
		
		if(selected.isSelected())
		{
			Thread.sleep(2000);
			selected.click();
			System.out.println("Check box is unchecked successfully");
		}
		else
		{
			System.out.println("Check box is not unchecked successfully");
		}
		
		//to select all the dropdown options
		
	
//		for (int i=1;i<=5;i++)
//		{
//			driver.findElement(By.xpath("//div[text()='Option [i]']//input")).click();
//		}
		
		
		driver.findElement(By.xpath("//div[text()='Option 1']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 2']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 3']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 4']//input")).click();
		driver.findElement(By.xpath("//div[text()='Option 5']//input")).click();
		
		
		
		
	}

}
