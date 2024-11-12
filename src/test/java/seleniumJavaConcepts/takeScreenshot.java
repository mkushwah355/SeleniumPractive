package seleniumJavaConcepts;

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
import java.time.Duration;

import com.google.common.io.Files;

public class takeScreenshot {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver","E:\\Automation\\selenium-java-4.18.1\\ChromeDriver 128\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
			
			//To give timestamp as name of screenshot file. 
			Date currentDate= new Date();
			String screenShotName= currentDate.toString().replace(" ","-").replace(":","-");
			System.out.println(screenShotName);
		
			//FileHandler is seleium library which introduced in latest version of it.
			File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String fileDestination= System.getProperty("user.dir")+".//test-output//screenshot//"+screenShotName+".jpeg";
			FileHandler.copy(screenShotFile, new File(fileDestination));
			
			/*File screenShotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShotFile, new File(".//test-output//screenshot//"+screenShotName+".jpeg"));*/
			
			driver.close();

	}

}
