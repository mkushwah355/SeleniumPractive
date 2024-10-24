package test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.*;

public class selenium_loginpage {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
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
		

		WebElement homePage= driver.findElement(By.xpath("//h1[@class='dynamic-heading']"));
		
		System.out.println(homePage.getText());
		driver.close();
		
		
		/*List<WebElement> practicePage= driver.findElements(By.xpath("//a[@type='button']"));
				
		for(WebElement e:practicePage) {	
			
			Thread.sleep(3000);
			if(e.getText().equalsIgnoreCase("Element Practice")) {
				e.click();
				break;
			}*/
			
		}
		
		
		
	}


