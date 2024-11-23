package seleniumConcepts;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Click on "Switch Window Example" button and type "python" on new window search field.
//And print all the search results using Iterator.
public class SwitchTo_Window_throughIterator {

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
//Click on "Open window" button in "Switch window Example" section.			
		WebElement switchWindowExampleButton= driver.findElement(By.xpath("//button[@id='openwindow']"));
		switchWindowExampleButton.click();

//Get all the windows		
		Set<String> newWindows= driver.getWindowHandles();		
		System.out.println("No of windows: "+ newWindows.size());
//using Iterator		
		Iterator<String> handles= newWindows.iterator();
		String parentWindow= handles.next();
		String childWindow= handles.next();
		driver.switchTo().window(childWindow);
		System.out.println("Title of child window: "+driver.getTitle());
		
//Insert "python" in search text box in new opened window and click on "search" button.	
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("python");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);		
//print all the search results of text "python".			
		List<WebElement> searchResultList=driver.findElements(By.xpath("//h4[@class='dynamic-heading']"));
		for(WebElement printSeachchResult:searchResultList) {

//get text of "Learn Python 3 from scratch"	course
			String pythonText=printSeachchResult.getText();
			System.out.println("Search Result for Python text: "+pythonText);
//Enter the text of child window into parent window of "Auto Suggest Example" field.
			driver.switchTo().window(parentWindow);
			driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys(pythonText);
			Thread.sleep(3000);			
		
		}		
		
		/*	for(String handles: newWindows) {
		//If current window is not equal to parentWindow then switch to it(we have to write this anyway otherwise selenium will switch back to parent window)			
				if(!handles.equals(parentWindow)) {
				driver.switchTo().window(handles);
		//Get the title of current window			
				System.out.println("Title of new windows: "+driver.getTitle());
				Thread.sleep(3000);
		//Insert "python" in search text box in new opened window.			
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys("python");
				Thread.sleep(3000);
		//click on "search" button			
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				Thread.sleep(3000);
		//print all the search results of text "python".			
				List<WebElement> searchResultList=driver.findElements(By.xpath("//h4[@class='dynamic-heading']"));
				for(WebElement printSeachchResult:searchResultList) {
					System.out.println("Search Result for Python text: "+printSeachchResult.getText());
				}}
				
			}*/
		

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
