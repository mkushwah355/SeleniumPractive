package ExtentReport;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots1 {
	
	public static String takeScreenshot(WebDriver driver, String fileName) throws IOException {
		String directory= "./ExtentReport/" + fileName + ".jpeg";
		//String directory= System.getProperty("user.dir")+".//ExtentReport" + "."+"PNG";
		File S1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(S1, new File(directory));
		String destination= directory+fileName;
		return destination;
	}
}
