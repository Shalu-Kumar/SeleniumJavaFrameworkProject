package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	WebDriver driver = null;


	By textBox_Search = By.name("q");

	By button_GoogleSearch = By.name("btnK");

	//we will have to create a constructor to call the driver from the test class.
	
	public GoogleSearchPageObjects(WebDriver driver1) {
		
		this.driver = driver1;
	}

	public void WriteTextInSearchBox(String text) {

		driver.findElement(textBox_Search).sendKeys(text);


	}

	public void ClickSearchButton () {

		driver.findElement(button_GoogleSearch).click();
	}

}