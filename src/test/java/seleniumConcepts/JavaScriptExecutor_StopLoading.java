package seleniumConcepts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Aim: Stop loading page through JavaScriptExecutor
//It is not actually stopping the loaded url.

class JavaScriptExecutor_StopLoading {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_all");
        
        js.executeScript("window.stop();");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        List<WebElement> list = driver.findElements(By.xpath("//div[@id='yourDB']//td[1]"));
            for (WebElement loop1 : list) {            	
            	System.out.println(loop1.getText());
                     }

        driver.quit();
    }
}
