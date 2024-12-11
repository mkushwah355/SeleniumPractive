package seleniumConcepts;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BrokenLinks {

	WebDriver driver;
	String baseUrl = "https://www.expedia.co.in/";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}

	@Test
	public void test() throws InterruptedException, IOException {	
		
		List<WebElement> linksList= clickableLinks(driver);
		
		for(WebElement link: linksList) {
			String href= link.getAttribute("href");
			System.out.println("URL " + href + " returned " + linkStatus(new URL(href)));
		}		
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	public static List<WebElement> clickableLinks(WebDriver driver){
		List<WebElement> linksToclick= new ArrayList<WebElement>();
		List<WebElement> elements= driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		
		for(WebElement e:elements) {
			if(e.getAttribute("href")!=null) {
				linksToclick.add(e);
			}
		}
		return linksToclick;
	}	
	public static String linkStatus(URL url) throws IOException {
		HttpURLConnection http= (HttpURLConnection) url.openConnection();
		http.connect();
		String responseMessage= http.getResponseMessage();
		http.disconnect();
		return responseMessage;
	}

}
