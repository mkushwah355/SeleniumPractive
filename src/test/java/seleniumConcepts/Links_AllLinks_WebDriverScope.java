package seleniumConcepts;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Aim: 
Print no. of links of web page.
Limiting WebDriver scope.
Click on each link in the column and check if the pages are opening.
*/
class Links_AllLinks_WebDriverScope{
	public static void main(String[] arg) {
	WebDriver driver = new ChromeDriver();	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	
//print number of all links of web page.	
	System.out.println("Total links of webapge: "+driver.findElements(By.tagName("a")).size());
	 
//Limiting WebDriver scope.
//(Use one findElement method and store in variable(i.e. footer) to move on certain section of web-page)
//"footer" will help to reach at specific location then we can perform any action in that section.	

	 WebElement footerdriver= driver.findElement(By.id("gf-BIG")); //limiting web driver scope
	 
	 System.out.println("Total links in footer section: "+ footerdriver.findElements(By.tagName("a")).size());	
	 
	 WebElement columndriver= footerdriver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	 						  columndriver.findElements(By.tagName("a")).size();
	 System.out.println("Discount section links: " +columndriver.findElements(By.tagName("a")).size());	
	 
//Click on each link in the column and check if the pages are opening.	 

	
	 for(int i=1; i<columndriver.findElements(By.tagName("a")).size();i++) {
		 
		 String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		 columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		 
		 Set<String> windows= driver.getWindowHandles();

//This code is not working from here due to broken link.		 
		 
			/* for(String handles: windows) {
				 driver.switchTo().window(handles);
				 System.out.println(driver.getTitle());
			 }*/
			/*Iterator<String> it=windows.iterator();
			
			while(it.hasNext())
			{
				
			   driver.switchTo().window(it.next());
			   System.out.println(driver.getTitle());
			
			}*/
		 
		 
	 }
	 
	 
	 
	 
}}