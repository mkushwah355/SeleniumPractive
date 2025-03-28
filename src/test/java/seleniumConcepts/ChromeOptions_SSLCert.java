package seleniumConcepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Aim: Handle HTTP certifications.
//HTTP cert- When web site shows "your connection is not private". We can accept the unsecured connection.
public class ChromeOptions_SSLCert {	
	public static void main(String[] arg) {		
		
		ChromeOptions option= new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		
		WebDriver driver= new ChromeDriver(option);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
