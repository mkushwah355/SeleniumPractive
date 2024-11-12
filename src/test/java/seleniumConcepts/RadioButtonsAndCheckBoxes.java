package seleniumConcepts;

//Selecting the radio buttons one by one on web page and checking whether they are selected or not (isSelected() method)
//isSelected(), isEnabled(), isDisplayed() are the methods.
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RadioButtonsAndCheckBoxes {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		WebElement bmwRadio= driver.findElement(By.xpath("//input[@id='bmwradio']"));
		bmwRadio.click();
		Thread.sleep(3000);
		WebElement benzRadio= driver.findElement(By.xpath("//input[@id='benzradio']"));
		benzRadio.click();
		
		WebElement bmwCheckBox= driver.findElement(By.xpath("//input[@id='bmwcheck']"));
		bmwCheckBox.click();
		Thread.sleep(3000);
		WebElement benzCheckBox= driver.findElement(By.xpath("//input[@id='benzcheck']"));
		benzCheckBox.click();
		Thread.sleep(3000);
		
		System.out.println("BMW Radio Button is selected? "+bmwRadio.isSelected());
		System.out.println("BENZ Radio Button is selected? "+benzRadio.isSelected());
		System.out.println("BMW Check box is selected? "+bmwCheckBox.isSelected());
		System.out.println("BENZ Check box is selected? "+benzCheckBox.isSelected());		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
