package seleniumRealTime_FailedTCScreenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.*;

//Aim: Capture screenshot only for failed test case.
public class BaseTest {
	static WebDriver driver;
		
		public static void initialization() {			
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");			
		}
		
		public void takeScreenshot(String testMethodName) throws IOException {
			File S1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(S1, new File("./failedTestScreenshot/"+"failed_"+testMethodName+""
					+ ".jpeg"));
					
		}
		
}
