package seleniumConcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//Aim: Search specific element on all five windows and print the title of element window
public class SwitchTo_Window_MultipleWindows_SpecificElement {
    public static void main(String[] args) throws InterruptedException {
   
        WebDriver driver = new ChromeDriver();

        // List of URLs to open in different tabs
        String[] urls = {
            "https://www.google.com",
            "https://www.github.com",
            "https://www.stackoverflow.com",
            "https://accounts.google.com/",
            "https://www.udemy.com/"
        };
       
        driver.get(urls[0]);  // Open the first URL

        for (int i = 1; i < urls.length; i++) {
            ((JavascriptExecutor) driver).executeScript("window.open();");// Open a new tab
            Set<String> allWindow= driver.getWindowHandles();// Update the list of window handles
            ArrayList<String> tabs = new ArrayList<>(allWindow);        
            driver.switchTo().window(tabs.get(i));// Switch to the new tab
            driver.get(urls[i]);// Open the URL in the new tab
            Thread.sleep(2000);// Small delay to allow page loading
        }

// Example: finding the element in all five windows
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        
        boolean isElementFound= false;
        for (String loop1:tabs) {
        	
        	driver.switchTo().window(loop1);
        	List<WebElement> elements= driver.findElements(By.xpath("//input[@type='email' and @class='whsOnd zHQkBf']"));        	
			
        	if (!elements.isEmpty()) {
				System.out.println("Element found in window: " + driver.getTitle());
				WebElement element = elements.get(0); // Perform actions on the element
				element.sendKeys("abc"); // Example action
				isElementFound = true;// Mark the element as found and break the loop
				break;
			}
        }
        if(!isElementFound) {
        	System.out.println("Element not found in any of the windows.");
        } 
        driver.quit();
    }
}
