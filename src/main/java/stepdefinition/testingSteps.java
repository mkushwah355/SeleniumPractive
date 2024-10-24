package stepdefinition;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testingSteps {

	static WebDriver driver;
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		String baseUrl= "https://www.letskodeit.com/";
		driver.manage().window().maximize();
		/*Dimension b= new Dimension(300,1020);          
		driver.manage().window().setSize(b);*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@When("User enter valid credentials")
	public void user_enter_valid_credentials() {
		
		WebElement loginLink = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		loginLink.click();
		
		WebElement enterEmail= driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']"));
		enterEmail.sendKeys("mkushwah355@gmail.com");
		
		WebElement enterPass= driver.findElement(By.xpath("//input[@id='login-password']"));
		enterPass.sendKeys("Mayank@123");
	}
	
	@Then("User navigate to home page after sucessfull login")
	public void user_navigate_to_home_page_after_sucessfull_login() {

		WebElement homePage= driver.findElement(By.xpath("//a[normalize-space()='MY COURSES']"));
		System.out.println(homePage.getText());
		
		
		
	}
	@And("Welcome message display on home page")
	public void welcome_message_display_on_home_page() {
		WebElement WelMsg= driver.findElement(By.xpath("//h1[@class='dynamic-heading']"));
		System.out.println(WelMsg.getText());
		driver.close();
	}
	

	
}
