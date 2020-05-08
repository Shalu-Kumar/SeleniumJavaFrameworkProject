package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test1.codemodular2;



public class PropertiesFile {
	
	static Properties prop = new Properties();


	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	//We are now creating function to read the property file
	public static void readPropertiesFile()  {
		//We are now making object for properties class
		

		try {

			InputStream input = new FileInputStream("C:\\Users\\King\\Desktop\\Java Projects\\Seleniumproject\\src\\Config\\Config.properties");
			//this statement will make our configuraton or properties file available to our java program
			prop.load(input);
			codemodular2.browser =  prop.getProperty("browser");
			System.out.println(codemodular2.browser);
			


		} catch (Exception e) {

			e.printStackTrace();
		}

	}


	public static void writePropertiesFile(){ 

		
		
		try {
			OutputStream output = new FileOutputStream("C:\\Users\\King\\Desktop\\Java Projects\\Seleniumproject\\src\\Config\\Config.properties");
		    prop.setProperty("browser","Chrome");
			prop.setProperty("result", "Pass");
			prop.store(output,null);
		}

	catch (Exception e) {

			e.printStackTrace();

	
	}
		

	}
}

	