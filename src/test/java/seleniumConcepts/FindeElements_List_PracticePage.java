package seleniumConcepts;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Go to "Lets kode it" home page then click on "Practice" tab and select the "Element Practice" option.
//Switch to new window and get the text of "Radio" button section.
public class FindeElements_List_PracticePage {

	WebDriver driver;
	String baseUrl = "https://www.letskodeit.com";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
}

	@Test
	public void test() throws InterruptedException {
//Click on "Practice" drop down tab on "Home page" of lets kode it.		
		WebElement dropDownTab= driver.findElement(By.xpath("//a[@class='dynamic-link dropdown-toggle']"));
		dropDownTab.click();
//Store the list of elements of "Practice" drop down tab. Two options are in list which are under "li" tag. 		
		List<WebElement> dropDown= driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-left']//li"));
		
		for(WebElement dropDownList:dropDown) {
		System.out.println("Drop down list: "+dropDownList.getText());
//Click on "Element Practice" option in list	
			if (dropDownList.getText().equals("Element Practice")) {
				Thread.sleep(2000);
				dropDownList.click();
//"Element Practice" opening in new window. So store main window first.			
				String mainWindow=driver.getWindowHandle();
//Store the list of windows. If window is not equal to main window then switch window.			
				Set<String> windowHandles= driver.getWindowHandles();
				for(String handle:windowHandles) {
					if(!handle.equals(mainWindow)) {
					
					driver.switchTo().window(handle);
//get the title of opened window					
					System.out.println("New window title: "+driver.getTitle());
//Find the "Radio" button section and get the text of it.	
					WebElement element=	driver.findElement(By.xpath("//div[@id='radio-btn-example']//legend[text()='Radio Button Example']"));
					System.out.println("PracticePage Radio button text: "+element.getText());
					Thread.sleep(3000);			
}}}}}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
