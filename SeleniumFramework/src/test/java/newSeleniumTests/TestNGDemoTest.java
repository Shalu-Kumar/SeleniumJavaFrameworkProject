package newSeleniumTests;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.Propertiesfile;

public class TestNGDemoTest {

	static WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest

	public void setuptest() {
		
		

		String projectPath =  System.getProperty("user.dir");
		Propertiesfile.getProperties();
		
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\King\\Desktop\\Java Projects\\SeleniumFramework\\Drivers\\geckodriver\\geckodriver.exe");
	
			driver = new FirefoxDriver();

		}

		 System.out.println(projectPath);
		
		
			
	}
	
	@Test
	
	public static void googlesearch() {
		
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Aarav Singh");
		
		//driver.findElement(By.name("btnK")).click();
		
		//or we can use beloW method as well if our program is unable to hit search button.
		
				driver.findElement(By.name("btnK")) .sendKeys(Keys.RETURN);
	}
	
	@AfterTest
	
		public void tearDownTest() {
			
			driver.close();
			//driver.quit();
			System.out.println("Test completed successfully");
			Propertiesfile.setProperties();
			
		}
		
}
				

		
