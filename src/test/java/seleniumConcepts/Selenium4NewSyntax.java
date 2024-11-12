package seleniumConcepts;

//New syntax of methods in selenium 4 version. So methods are deprecated in selenium 4
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium4NewSyntax {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
//Implicit wait		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);//Older version implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//Selenium 4 version implicit wait
//Explicit wait		
		//WebDriverWait wait = new WebDriverWait(driver, 3);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); //Older version Explicit wait
		WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("abc"))); //Selenium 4 version Explicit wait
//Desired capabilities
		// Desired Capabilities -> Deprecated. Replaced with Options
		// DesiredCapabilities caps = DesiredCapabilities.firefox();
		// Example
		ChromeOptions options = new ChromeOptions();
		
		

	}

}
