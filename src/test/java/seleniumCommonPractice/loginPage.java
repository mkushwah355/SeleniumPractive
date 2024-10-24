package seleniumCommonPractice;
import java.util.List;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.RemoteWebDriver;

public class loginPage {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		RemoteWebDriver driver = new ChromeDriver();
		String baseUrl= "https://www.letskodeit.com/";
		driver.manage().window().maximize();
		/*Dimension b= new Dimension(300,1020);          
		driver.manage().window().setSize(b);*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		loginLink.click();
		
		WebElement enterEmail= driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']"));
		enterEmail.sendKeys("mkushwah355@gmail.com");
		
		WebElement enterPass= driver.findElement(By.xpath("//input[@id='login-password']"));
		enterPass.sendKeys("Mayank@123");
		
		WebElement loginButton= driver.findElement(By.xpath("//button[@id='login']"));
		loginButton.click();
		
		Thread.sleep(3000);
		
		List<WebElement> practicePage= driver.findElements(By.xpath("//a[@type='button']"));
				
		for(WebElement e:practicePage) {	
			
			Thread.sleep(3000);
			if(e.getText().equals("Element Practice")) {
				e.click();
				break;
			}
			
		}
		
		
		
	}

}
