package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathlearn {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
		driver.findElement(By.name("lastname")).sendKeys("T");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("+91 8678928215");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("12345678");
		WebElement d=driver.findElement(By.id("day"));
		Select d1=new Select(d);
		d1.selectByValue("6");
		
		WebElement m=driver.findElement(By.id("month"));	
		Select m1=new Select(m);
		m1.selectByVisibleText("Dec");
		
		WebElement y=driver.findElement(By.id("year"));
		Select y1=new Select(y);
		y1.selectByValue("1994");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();	
		
		System.out.println(driver.getTitle());
	}

}
