package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	

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
				
				//to click on Phone tab
				
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				//to enter phone number
				
				//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9221244775");
				
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9696969696");
				
				//to click find lead
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(2000);
				
				//to find lead id
				
				WebElement leadID=driver.findElement(By.xpath("((//a[@class='linktext'])[4])"));
				//leadID.getText();
				
				
				System.out.println("LEAD ID :- "+leadID.getText());
				
				
				
	}
	

}
