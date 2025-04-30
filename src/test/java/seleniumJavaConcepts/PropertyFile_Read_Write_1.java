/*Aim(everything from config.properties file):
1. Launch the chrome browser. Enter the "JavaTpoint" text and click on search button.Close the browser.
2. To Perform above task, config.properties need to be created and mention the below key value parameters.
   a. URL=https://www.google.com/
   b. browsername = chrome
   c. xpathOfGoogleSearchBox= //input[@title='Search']
   d. text= JavaTpoint
   e. xpathOfGoogleSearchButton= //div[@class='FPdoLc lJ9FBc']//input[@name='btnK'] 
*/
package seleniumJavaConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile_Read_Write_1 {

	public static void main(String[] arg) throws IOException, Exception {
		WebDriver driver = null;

		Properties prop = new Properties();// ini the properties class of java		
		FileInputStream ip = new FileInputStream("C:\\git projects\\SeleniumPractive\\config.properties");// ini FileInputStream class of java to get the input file
		prop.load(ip);// to load the input file

		String url = prop.getProperty("URL");// url reference variable created to read the URL key and its value from
		System.out.println("Launched url: " + url);
		String browserName = prop.getProperty("browser");
		String googleSearchBox = prop.getProperty("xpathOfGoogleSearchBox");
		String Text = prop.getProperty("text");
		String googleSearchButton = prop.getProperty("xpathOfGoogleSearchButton");
		String browerType = prop.getProperty("browsername");

// to launch the broswer, need to ini chromedriver
		if (browerType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Automation\\selenium-java-4.18.1\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.get(url);
		driver.findElement(By.xpath(googleSearchBox)).sendKeys(Text);
		driver.findElement(By.xpath(googleSearchButton)).click();
		WebElement s1 = driver.findElement(By.xpath(prop.getProperty("xpathOfSearchreResultCount")));
		System.out.println("Total search result: " + s1.getText());
		Thread.sleep(3000);
		driver.close();

	}

}
