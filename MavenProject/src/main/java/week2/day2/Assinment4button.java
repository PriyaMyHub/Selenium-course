package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Assinment4button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		Actions action=new Actions(driver);
		
		//Click and confirm title
		//driver.findElement(By.xpath("//span[text()='Click']")).click();
		System.out.println(driver.getTitle());
		
		//Confirm on Button disabled-ElementClickInterceptedException
//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).click();
//		System.out.println("The button is disabled");
		
		//Position of submit button
		WebElement f=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']"));
		Point p1=f.getLocation();
		System.out.println("Position of Submit button is"+" "+p1);
		
		//Find color of the button
		WebElement t=driver.findElement(By.xpath("//span[text()='Save']"));
		String s=t.getCssValue("background");
		System.out.println("Color of Save button is "+ s);
		
		
		//Find height and width of Button
		WebElement h=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
		Dimension h1=h.getSize();
		System.out.println("Size of Submit button is"+" "+h1);
		
		//Button color change
		
		WebElement cc=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		
		//Button Color after mousehover
		String cc1=cc.getCssValue("background");
		System.out.println("Button Color before mousehover is "+ cc1);
	
		//Mousehover action
		action.moveToElement(cc).build().perform();
		
		//Button Color after mousehover
		String cc3=cc.getCssValue("background");
		System.out.println("Button color after mousehover is "+ cc3);
		
		//Click on hidden button
//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
//		System.out.println("No hidden element found");
		
		
		int count = 0;
	    try {
	         WebElement w = (WebElement) driver.findElement(By.xpath("//button[contains(@class,'ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only rounded-button mr-2 mb-2']")).getSize();
	         for (int i = 0; i<w.getSize(); i++) {
	            count = i;
	        }
	        System.out.print("############################################# " + count);

	    }
	    catch (Exception e)
	    {

	    }
	    return count;

	}

	}


