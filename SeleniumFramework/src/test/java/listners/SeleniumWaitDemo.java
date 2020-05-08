package listners;



import java.time.Duration;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		seleniumwaits();
	}
	
	@SuppressWarnings("deprecation")
	public static void seleniumwaits() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Default frequency for pulling is 250ms for whatever the time you will specify.
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
	//driver.findElement(By.name("abcd")).click();
		//read at selniumhq site about the waits
	WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
	// Print the first result
	System.out.println(firstResult.getText());


//WebDriverWait wait = new WebDriverWait(driver, 20);
//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		
		driver.close();
		driver.quit();
		
	}
	
	
	
	
	
}
