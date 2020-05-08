package newSeleniumTests;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemoTest2 {
	
	WebDriver driver = null;
	
	@BeforeTest

	public void setuptest() {
		
		
		 String projectPath =  System.getProperty("user.dir");
		 System.out.println(projectPath);
		
		System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
			
	}
	


@Test

public static void googlesearch3() {
	
	 String projectPath =  System.getProperty("user.dir");
	 System.out.println(projectPath);
	
	System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("Aarav Singh");
	
	//driver.findElement(By.name("btnK")).click();
	
	//or we can use beloW method as well if our program is unable to hit search button.
	
			driver.findElement(By.name("btnK")) .sendKeys(Keys.RETURN);
}
	
	@Test
	
	public static void googlesearch2() {
		
		 String projectPath =  System.getProperty("user.dir");
		 System.out.println(projectPath);
		
		System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Aarav Singh");
		
		//driver.findElement(By.name("btnK")).click();
		
		//or we can use beloW method as well if our program is unable to hit search button.
		
				driver.findElement(By.name("btnK")) .sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	
		public void tearDownTest() {
			
			
			driver.quit();
			System.out.println("Test completed successfully");
			
		}
		
}
				

		
