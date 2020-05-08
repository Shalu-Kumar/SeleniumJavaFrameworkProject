package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CODEModular {

	static String browsers;
	static WebDriver driver;

	public static void main(String[] args) {

		setBrowser();
		setBrowserConfig();
		runTest();


	}		
	//setBrowser
	//setBrowserConfig
	//runTest


	public static void setBrowser() {

		browsers = "chrome";
	}

	public static void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");

		if(browsers.contains("fireFox")){
			
			System.setProperty("webdriver.gecko.driver",projectLocation + "\\lib\\geckodriver\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		if(browsers.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",projectLocation+"/lib/Chromedriver/chromedriver.exe");

			driver = new ChromeDriver();
		}

	}
	public static void runTest(){


		driver.get("https://selenium.dev/");

		driver.quit();

	}

}



