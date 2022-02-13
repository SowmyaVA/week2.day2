package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	
	public static void main (String[] args)
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","./src/main/resources/drivers/chromedriver");
		
		//System.setProperty("webdriver.chrome.driver","/Users/mac/eclipse-workspace/MavenProject/./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//login with user name and password
		WebElement userid=driver.findElement(By.id("username"));
		userid.sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//to click on the link CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//to click on LEAD tab
		driver.findElement(By.linkText("Leads")).click();
		//to click on the create lead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		//to select a value from drop-down Sources
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedd=new Select(source);
		sourcedd.selectByVisibleText("Employee");
		
		//to select a value from drop-down
		WebElement industry=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrydd=new Select(industry);
		industrydd.selectByIndex(5);
		
		//to select a value from drop-down
				WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select ownershipdd=new Select(ownership);
				ownershipdd.selectByValue("OWN_PARTNERSHIP");
		
	}

}
