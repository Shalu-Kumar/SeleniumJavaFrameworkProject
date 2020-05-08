package newSeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	
	private static WebDriver driver = null;

 public static void main(String[] args) {
	 
	 //DesiredCapabilities caps = new desiredCapabilities();
	 //caps.setCapability("ignoreprotectedmode", true);
	

	// start reporters
	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
	 
	 // create ExtentReports and attach reporter(s)
	 ExtentReports extent = new ExtentReports();
	 extent.attachReporter(htmlReporter);
	 
	 
	// creates a toggle for the given test, adds all log events under it    
     ExtentTest test1 = extent.createTest("Google Search", "This is a test to search googl functionality");
	 
     String projectPath =  System.getProperty("user.dir");
	 System.out.println(projectPath);
	
	System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
	
	
	driver = new ChromeDriver();
	
	
	test1.log(Status.INFO, "Starting Test Case");
	driver.get("https://google.com");
	test1.pass("Navigated to google.com");
	
	driver.findElement(By.name("q")).sendKeys("Automation");
	test1.pass("Entered text in searchbox");
	
	driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
	test1.fail("Pressed keyboard Enter key ");
	
	driver.close();
	driver.quit();
	test1.pass("Closed the browser");
	
	test1.info("Test Completed");
	
	 // calling flush writes everything to the log file
    extent.flush();
	 
	 
}

}


