package seleniumConcepts;

//Selecting the options of drop down field which are under <select> tag through select class.
//getOptions(), selectByValue(), selectByIndex(), selectByVisibleText are the methods

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClass_DropDownElements {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com/practice";

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get(baseUrl);
	}

	@Test
	public void test() {
		
	WebElement selectDropDown= driver.findElement(By.xpath("//select[@id='carselect']"));
	Select sel= new Select(selectDropDown);
	
	sel.selectByValue("bmw");
	sel.selectByIndex(1);
	sel.selectByVisibleText("Honda");
	
	List<WebElement> element= sel.getOptions();
	for(int i=0;i<element.size();i++) {
		System.out.println(element.get(i).getText());
	}
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
