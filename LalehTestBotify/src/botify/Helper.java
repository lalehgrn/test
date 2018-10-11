package botify;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Helper {

	public static void searchWithFilter (String filtername, String filtervalue) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\laleh\\Documents\\geckodriver\\geckodriver.exe");
	      
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("lst-ib")).sendKeys(filtername+":"+filtervalue +" testing");
			driver.findElement(By.name("btnK")).click();
			
			//find all elements
			List<WebElement> listings = driver.findElements(By.className("iUh30")); 
			for (WebElement loop : listings) {
				Assertions.assertTrue(loop.getText().contains(filtervalue));
				driver.close();
		    }
		
	}	
}

