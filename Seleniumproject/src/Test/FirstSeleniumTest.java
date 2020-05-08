package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumTest {
	
	public static void main(String[] args) {
	
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectLocation+"/lib/Chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium.dev/");
		
		driver.quit();
		
		
		
	}

}
