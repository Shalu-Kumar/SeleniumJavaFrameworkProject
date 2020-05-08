package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirefoxbrowserTest {
	
	public static void main(String[] args) {
		
		//•	If we are taking our project to some other location. Then these absolute location (like in the above statement “location of the gecko driver exe file) will not work.
		//•	We can get the relative path. And we can get the location and path of our project by using: System.setProperty(“user.dir”); and save it to any string like : String projectLocation = System.setProperty(“user.dir”);


	String projectLocation = System.getProperty("user.dir");
		
			
		System.setProperty("webdriver.gecko.driver",projectLocation + "\\lib\\geckodriver\\geckodriver.exe");
		
		//The below code we only need to use if we get any error related to binary firefox path)
		//System.setProperty("WebDriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox-bin");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://selenium.dev/");
		
		driver.quit();
		
		
		
		
	}

}
