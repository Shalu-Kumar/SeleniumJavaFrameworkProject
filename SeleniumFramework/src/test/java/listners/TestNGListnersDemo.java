package listners;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




public class TestNGListnersDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test1");

	}
	@Test
	public void test2() {
		System.out.println("I am inside test2");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//this is invalid locator to deliberately fails the test
		//driver.findElement(By.name("a")).sendKeys("Automation step by step");
			driver.close();
	}
	@Test
	public void test3() {
		System.out.println("I am inside test3");
		throw new SkipException ("This test is skipped");
	}


}
