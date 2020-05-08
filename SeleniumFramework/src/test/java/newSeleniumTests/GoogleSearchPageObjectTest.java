package newSeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageObjectTest {
	
	private static WebDriver driver1 = null;
	
	
	public static void main(String[] args) {
		
		googlesearchtest();
	
	}

	public static void googlesearchtest() {
		String projectPath =  System.getProperty("user.dir");
		System.setProperty("webdriver.Chrome.driver", projectPath+ "/Drivers/chromedriver/chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		pages.GoogleSearchPageObjects SearchPageObj = new pages.GoogleSearchPageObjects(driver1);
		
		driver1.get("https://google.com");
		SearchPageObj.WriteTextInSearchBox("Aarav Singh");
		
		SearchPageObj.ClickSearchButton();
		
		driver1.close();
		
		

}
	
	
}
