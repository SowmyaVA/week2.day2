package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
{
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//to maximize the window size
				driver.manage().window().maximize();
				
				//login with user name and password
				WebElement userid=driver.findElement(By.id("username"));
				userid.sendKeys("DemoCSR");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				
				//to click on the link CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//to click on leads tab
				
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				
				//to click on find leads
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				
				//enter first name
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sowmya");
				
				//to click on find lead
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(2000);
				
				//to click on the first result
				
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[@class='linktext']")).click();
				
				//to find page title
				
			WebElement page=driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
			
			String pageTitle=page.getText();
			
			if (pageTitle.equalsIgnoreCase("View Lead"))
			{
				System.out.println("View Lead Page Loaded successfully");
			}
			else
			{
				System.out.println("Page not loaded successfully");
			}
			
			//to click on edit button
			
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			
			Thread.sleep(2000);
			
			//to edit company name
			
			driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
			
			driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("XYZ COMPANY");
			
			
			//to click on Udpate icon
			
			driver.findElement(By.xpath("//input[@name='submitButton' and @value='Update']")).click();
			
			Thread.sleep(2000);
			
			//to find updated company name
			
			WebElement compName=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
			
			String updatedCompName=compName.getText();
			
			if(updatedCompName.contains("XYZ COMPANY"))
				
			{
				System.out.println("Updated company name is : - " + updatedCompName);
			}
			else
			{
				System.out.println("value is not updated");
			}
			
			//close the browser
			
			driver.close();
			

				
	}

}
