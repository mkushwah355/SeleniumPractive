package seleniumConcepts;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Navigate to url and click on "Select PDF file" link and create AutoIT script to move focus to "File" input fled and then click on "open" button.

public class AutoIT_FileUpload_PDFToWordConverter {

	WebDriver driver;
	String baseUrl="https://www.ilovepdf.com/pdf_to_word";
	
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
			
}
	@Test
	public void test() throws InterruptedException, IOException {	
	
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\git projects\\SeleniumPractive\\src\\test\\resources\\AutoIT_FileUpload.exe");
		Thread.sleep(3000);				
}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
