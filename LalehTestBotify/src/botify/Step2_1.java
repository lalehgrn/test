package botify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.junit.jupiter.api.Assertions;;


public class Step2_1 {
	
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\laleh\\Documents\\geckodriver\\geckodriver.exe");
       String host = "wikipedia.com";
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("site:"+host +" testing");
		driver.findElement(By.name("btnK")).click();
		
		//find all url elements
		List<WebElement> listings = driver.findElements(By.className("iUh30")); 
		for (WebElement loop : listings) {
	      			
			//verify that url contains the correct host
			Assertions.assertTrue(loop.getText().contains(host));
			
	    }

	
	 driver.close();
	
	}
	
}