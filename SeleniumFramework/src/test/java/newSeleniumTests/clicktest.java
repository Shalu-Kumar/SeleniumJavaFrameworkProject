package newSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clicktest {
	
public static void main(String[] args) {
		
		googlesearch();
		
	}
	
	public static void googlesearch() {
		
		 String projectPath =  System.getProperty("user.dir");
		 System.out.println(projectPath);
		
		System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Aarav Singh");
		
		//driver.findElement(By.name("btnK")).click();
		
		//or we can use beloW method as well if our program is unable to hit search button.
		
				driver.findElement(By.name("btnK")) .click();
				
			
				

		//driver.close();
		
		System.out.println("Test completed successfully");
	}
}



