package seleniumXpathPractice;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//Aim: Get the list of all sponsored phones which are under 20K.
//Below code is navigating to amazon website and searching "mobile phone under 20000"
//then getting the list of all sponsored phones which are under 20K.
class amazon_sponsoredPhoneList{
	
	public static void main (String[]arg) {				
		WebDriver driver= new EdgeDriver();
		String url= "https://www.amazon.in/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phone under 20000");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		List<WebElement> sponsoredList= driver.findElements(By.xpath("//*[@role='listitem']//h2[contains(@aria-label,'Sponsored Ad')]"));
		
		for(WebElement l:sponsoredList) {
			String s1= l.getText();
			System.out.println(s1);
		}		
		driver.quit();
		
	}
}
