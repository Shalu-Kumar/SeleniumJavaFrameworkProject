package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Googlesearch_Page {
	
	// and to make it available to only this class we will make it private
	private static WebElement element = null;
	
	// here WebElemet is the return type of the function element.
	public static WebElement textbox_search (WebDriver driver) {
		
		element = driver.findElement(By.name("q")); // to store this driver we will store it in WebElement.
		// we also need return so we will use the below step and here the Void above is the return type so we will change that oid to return type element.
		return element;
		
	}
	
	public static WebElement button_search (WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
				return element;
		
		
		
	}

}
