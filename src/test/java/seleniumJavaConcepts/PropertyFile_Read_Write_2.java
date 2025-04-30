package seleniumJavaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile_Read_Write_2 {

	public static void main(String[] arg) throws Exception {

		Properties prop = new Properties();	
		prop.load(new FileInputStream("C:\\git projects\\SeleniumPractive\\config.properties"));
		
		System.out.println(prop.getProperty("URL"));
		
		
		prop.setProperty("name", "sam2");
		prop.store(new FileOutputStream("C:\\git projects\\SeleniumPractive\\config.properties"), "same name changed");
		
		
		
		
		
	}

}
