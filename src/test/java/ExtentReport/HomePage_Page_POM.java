package ExtentReport;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage_Page_POM {
	
	WebDriver driver;
	ExtentTest test;
	
	HomePage_Page_POM(WebDriver driver, ExtentTest test){
		this.driver=driver;
		this.test=test;
		
	}	
	
	public void clickSignupLink() {
		WebElement signUpLink = driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		signUpLink.click();
		test.log(LogStatus.INFO, "Clicked on signup link");
		
	}
	
	public void clickEmailField(String email) {
		WebElement emailField = driver.findElement(By.xpath("//form[@name='loginform']//input[@id='email']"));
		emailField.sendKeys(email);
		test.log(LogStatus.INFO, "Enter email");
		
	}
	public void clickPassField(String pass) {
		WebElement passwordField = driver.findElement(By.xpath("//input[@id='login-password']"));
		passwordField.sendKeys(pass);
		test.log(LogStatus.INFO, "Enter password");
		
	}
	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='login']"));
		loginButton.click();
		test.log(LogStatus.INFO, "Clicked loginButton");
		
	}
	public boolean isWelcomeTextPresent() {
		WebElement welcomeText = null;
		try {
			welcomeText = driver.findElement(By.xpath("//h1[@class='dynamic-heading']"));
			if (welcomeText != null) {
				return true;
			}
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}
	public void login(String email, String password) {
		clickSignupLink();
		clickEmailField(email);
		clickPassField(password);
		clickLoginButton();
	}
}
