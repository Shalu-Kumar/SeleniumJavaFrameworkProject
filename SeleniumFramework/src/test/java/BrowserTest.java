import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		
		//System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.i.e.driver",projectPath+"\Drivers\I.E.driver\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();	
				driver.get("https://www.selenium.dev/");
				
				
				//System.setProperty("webdriver.gecko.driver", projectPath+ "/Drivers/geckodriver/geckodriver.exe");
					//WebDriver driver = new FirefoxDriver();
				
		//try {
			//Thread.sleep(3000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
				
		driver.getTitle();
		System.out.println("The title is:"+driver.getTitle());
		
		driver.close();
		
		//driver.quit();
		
	}

}
