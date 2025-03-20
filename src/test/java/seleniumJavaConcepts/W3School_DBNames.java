package seleniumJavaConcepts;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Aim: Go to W3School and get all the DB names
//As of now W3School url is keep on loading which causing to execute remaining code after get(url).
//We have to manually stop loading the url then remaining code is executing.
public class W3School_DBNames {

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
