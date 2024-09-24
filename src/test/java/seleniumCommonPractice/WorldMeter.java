package seleniumCommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldMeter {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mayan\\workspace\\libs\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.worldometers.info/world-population/";
		driver.get(url);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		int attempts = 0;
	    while(attempts < 2) {
	        try {
	        	WebElement s1=driver.findElement(By.xpath("//*[@class='maincounter-number']//span[8]"));
	        	s1.getText();
	        	System.out.println("last three number: " + s1);
	            break;
	        } catch(Exception e) {
	        }
	        attempts++;
	    }
		
		//*[@class='maincounter-number']
		//*[@class='maincounter-number']//span[8]
		//div[@id='maincounter-wrap']//span[@class='rts-counter']
		
		
		driver.close();
	}

}
