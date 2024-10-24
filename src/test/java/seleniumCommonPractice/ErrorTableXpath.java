package seleniumCommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorTableXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\selenium-java-4.18.1\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://semantic-ui.com/collections/table.html#error";
		driver.get(url);
		driver.manage().window().maximize();
		String s1=driver.findElement(By.xpath("//*[@class='error']//parent::tbody/tr[3]/td[3]//preceding-sibling::td[2]")).getText();
		System.out.println("row: " + s1);
		driver.close();
		//

	}

}
