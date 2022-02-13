

package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	


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
				
				//to click on email tab
				
				driver.findElement(By.xpath("//span[text()='Email']")).click();
				
				//to enter the email id
				
				driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("divya123@abc.com");
				
				//to click find lead
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(2000);
				
				//to find the first name
				
				WebElement firstName=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]"));
				
				String firstLeadName=firstName.getText();
				
				System.out.println("First name is :- "+firstName.getText());
				
				
				//to click the first entry of the result
				
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[@class='linktext'])[1]")).click() ;
				
				//to click on duplicate lead
				
				driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
				
				//to find the title
				
				WebElement title=driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']"));
				
				
				
				String pageTitle=title.getText();
				
				if(pageTitle.equalsIgnoreCase("Duplicate Lead"))
				{
					System.out.println("Page Title is : "+title.getText());
				}
				else
				{
					System.out.println("Page is not loaded successfully");
				}
				
				//to click Create Lead
				
				 driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
				
				
				 //to find the firstname
				 
				WebElement duplicateFirstName= driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
				 
				 String duplicateLeadName=duplicateFirstName.getText();
				 
				 if (duplicateLeadName.equalsIgnoreCase(firstLeadName))
				 {
					 System.out.println("Duplicate Lead Name is same as FirstLeadName");
				 }
				 else
				 {
					 System.out.println("Duplicate Lead Name is not same as FirstLeadName");
				 }
				 
				 // to close the browser
				 driver.close();
				 
				
	}
	
	

}
