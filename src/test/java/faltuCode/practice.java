package faltuCode;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice {

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
	public void test() throws InterruptedException {		
			int sizeOfA= driver.findElements(By.tagName("a")).size();
			System.out.println(sizeOfA);
		
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
