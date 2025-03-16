package seleniumConcepts;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Navigate to page and get all the links which are under "a" & "img" tag name.
//Get response code and message of "href" attribute.
public class BrokenLinks_2 {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	@Test
	public void test() throws InterruptedException, IOException {
//store all the links which are under tagname "a" & "img"
		List<WebElement> clickableLinks = driver.findElements(By.tagName("a"));
		clickableLinks.addAll(driver.findElements(By.tagName("img")));

		for (WebElement link : clickableLinks) {
//get the attribute of tag which we want to check
			String url = link.getAttribute("href");
//URL class is deprecated but will look for another method.
			HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();

			http.setRequestMethod("HEAD");
			http.connect();
//get the response code and message of "href" attribute
			int respCode = http.getResponseCode();
			String respMsg = http.getResponseMessage();
			System.out.println(url+" "+respCode + respMsg);

		}

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

}
