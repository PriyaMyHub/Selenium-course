package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testleaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("crmsfa");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
		WebElement s = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s1=new Select(s);
		s1.selectByIndex(4);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.name("description")).sendKeys("About softwares");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyanka@gmail.com");
		WebElement c=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select c1=new Select(c);
		c1.selectByVisibleText("India");	
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("About software");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		
		
		
		
		
		
		

	}

}
