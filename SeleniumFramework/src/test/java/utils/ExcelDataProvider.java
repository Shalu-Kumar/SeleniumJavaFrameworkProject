package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.Propertiesfile;

public class ExcelDataProvider {

	//static WebDriver driver = null;
	//
	//@BeforeTest
	//public void setuptest() {



		//String projectPath =  System.getProperty("user.dir");
		//Propertiesfile.getProperties();

		//System.setProperty("webdriver.geckodriver.driver", "C:\\Users\\King\\Desktop\\Java Projects\\SeleniumFramework\\Drivers\\geckodriver\\geckodriver.exe");
		//driver = new FirefoxDriver();
	//}
	
	//@Test(dataProvider = "test1data")
	//public void test1 (String username, String password) throws Exception {
		//System.out.println(username+"  |  "+password);
		//this is for the site "OrangeHRM" for which i haven't sign up so can't really do this testing but the below is just for my understanding
		//driver.get("https://www.orangehrm.com/?gclid=EAIaIQobChMInOmlreKU6QIVCu3tCh2mEwH_EAAYASAAEgJsN_D_BwE");
		//driver.findElement(By.id("txtUsername")).sendKeys(username);
		//driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		//Thread.sleep(2000);
	//}

	//
	
	@DataProvider(name = "test1data")
	public  Object getData() {
		String excelPath = "C:\\Users\\King\\Desktop\\Java Projects\\SeleniumFramework\\excel\\New XLSX Worksheet.xlsx";
		Object data [][] = testData(excelPath, "Sheet1");
		return data;
}



	public Object[][] testData (String excelPath, String sheetName) {
		Excelutils excel = new Excelutils(excelPath, sheetName);

		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];

		for (int i=1; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {

				String cellData = 	excel.getCellDataString(i, j);
				//System.out.print(cellData+ " | ");
				data[i-1][j] = cellData;


			}
			
			

			//System.out.println();


		}
		return data;
	}
}

