package newSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Googlesearch_Page;


public class GoogleSearch_PagesTest {
	private static WebDriver driver = null;


	public static void main(String[] args) {

		googlesearch();

	}

	public static void googlesearch() {

		String projectPath =  System.getProperty("user.dir");
		System.out.println(projectPath);

		System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		pages.Googlesearch_Page.textbox_search(driver).sendKeys("Automation step by step");

		//driver.findElement(By.name("btnK")).click();

		//or we can use beloW method as well if our program is unable to hit search button.

		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		pages.Googlesearch_Page.button_search(driver).sendKeys(Keys.ENTER);
		
		driver.close();

		System.out.println("Test completed successfully");
	}
}
