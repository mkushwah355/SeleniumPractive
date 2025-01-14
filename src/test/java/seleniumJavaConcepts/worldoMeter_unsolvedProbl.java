package seleniumJavaConcepts;
import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.Duration;
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

public class worldoMeter_unsolvedProbl {	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\Automation\\selenium-java-4.18.1\\ChromeDriver 128\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
				driver.get("https://www.worldometers.info/");	
				driver.manage().window().maximize();
				WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));			
				WebElement d=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@rel='current_population']//span[8]")));
			           d.getAttribute(null);
				
				
				System.out.println(d);
				driver.close();
		}}
