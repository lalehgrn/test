package botify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.junit.jupiter.api.Assertions;;


public class Step1 {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\laleh\\Documents\\geckodriver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("site");
		driver.findElement(By.name("btnK")).click();
		List<WebElement> listings = driver.findElements(By.className("LC20lb"));
		//for (WebElement loop : listings) {
	       // System.out.println(loop.getText());
	   // }
		
	//System.out.println(listings.size()-1);
	Assertions.assertEquals(listings.size()-1,10);
	
	 driver.close();
	
	}
	
}
