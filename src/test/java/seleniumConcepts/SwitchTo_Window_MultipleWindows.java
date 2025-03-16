package seleniumConcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.Set;

public class SwitchTo_Window_MultipleWindows {
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

        // Open the first URL
        driver.get(urls[0]);

        for (int i = 1; i < urls.length; i++) {
// Open a new tab
            ((JavascriptExecutor) driver).executeScript("window.open();");
            
// Update the list of window handles
            Set<String> allWindow= driver.getWindowHandles();
            ArrayList<String> tabs = new ArrayList<>(allWindow);
        
// Switch to the new tab
            driver.switchTo().window(tabs.get(i));

// Open the URL in the new tab
            driver.get(urls[i]);

// Small delay to allow page loading
            Thread.sleep(2000);
        }

// Example: Printing the title of 4th tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        
        String tab4Title="";
        for (int i = 1; i < tabs.size(); i++) {
            driver.switchTo().window(tabs.get(4));
            tab4Title=driver.getTitle();
            
        }
        System.out.println("4th Tab Title: " +tab4Title );
        driver.quit();
    }
}
