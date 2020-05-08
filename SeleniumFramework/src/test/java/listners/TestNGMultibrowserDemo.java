package listners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultibrowserDemo {
	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");


	@Parameters("browserName")
	@BeforeTest

	public void setup(String browserName) {
		System.out.println("Browser name is:" +browserName);

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+ "/Drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();

		}
		else if (browserName.equalsIgnoreCase("i.e.")) {
			System.setProperty("webdriver.i.e.driver",projectPath+"/Drivers/I.E.driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}				
	}

@Test
public void test1() {
	driver.get("https://google.com");	

	}
	@AfterTest
	public void teardown() throws Exception {
		driver.close();
		System.out.println("Test Completed Succesfully");
		Thread.sleep(4000);

	}






}
