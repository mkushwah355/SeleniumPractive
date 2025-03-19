package seleniumConcepts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessMode {	  
	
	public static void main (String [] arg) {
		
		// Set up ChromeOptions for headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Enable headless mode
        options.addArguments("--disable-gpu"); // Disable GPU for compatibility
        
        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);
        
        // Load the target URL
        driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all"); // Replace with the actual URL
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> list= driver.findElements(By.xpath("//div[@id='yourDB']//tr"));
		 
		 
		if (list.isEmpty()) {
            System.out.println("No elements found.");
        } else {
            for (WebElement loop1 : list) {
                String titleDB = loop1.getText();
                System.out.println(titleDB);
            }
        }
		  
		  driver.quit();
	
	}
	
}
