package seleniumConcepts;

//Selecting the multiple options of list which are under <multiple=""> tag.
//getAllSelectedOptions(),deselectAll(), deselectByValue(), deselectByIndex(), deselectByVisibleText() are the methods

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

public class SelectClass_MultiSelect {

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
		
	WebElement multiSelect= driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
	Select sel= new Select(multiSelect);
	
	sel.selectByValue("orange");
	sel.deselectByValue("orange");
	sel.selectByIndex(0);
	sel.selectByVisibleText("Peach");	
	
	List<WebElement> selectedOptions= sel.getAllSelectedOptions();
	for(WebElement options:selectedOptions) {
		System.out.println(options.getText());
	}
	
	sel.deselectAll();
	
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
