package faltuCode;


import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\selenium-java-4.18.1\\ChromeDriver 128\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.worldometers.info/");	
			driver.manage().window().maximize();
			try {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
			WebElement d=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@rel='current_population']//span[8]")));
		           d.getAttribute("value");
			
			System.out.println(d);
			} catch(Exception e) {
				System.out.println(e);
			}
			driver.close();
		

	}

	

}
