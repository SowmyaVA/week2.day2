package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 

{

	
	public static void main(String[] args)
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
				
				// to click contacts tab
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				//click create contact
				driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
				
				//to enter first name
				driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Sowmya");
				//to enter last name
				driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("VA");
				
				//to enter first name local
				
				driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Sowmya");
				
				//to enter last name local
				
				driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("VA");
				
				
				//input department data
				driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("JAVA SELENIUM AUTOMATION");
				
				//to input description
				
				driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Week2 day2 assignment");
				
				
				// to input email id
				
				driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sowmya@gmail.com");
				
				//to select state province
				
				WebElement stProvince=driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
				
				Select stateProvince=new Select(stProvince);
				
				
				stateProvince.selectByVisibleText("New York");
				
				//click create button
				
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				//to click edit button
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
				//to clear description area
				
				driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
				
				//to fill important area
				
				driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Important Notes");
				
				
				//to click update button
				
				driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
				
				
				//to get title of the page
				
				WebElement Title=driver.findElement(By.xpath("//div[text()='View Contact']"));
				//Title.getText();
				
				System.out.println("Title is : "+Title.getText());
				
		
	}
	
}
