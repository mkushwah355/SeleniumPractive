package ExtentReport;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport_Instance {

	public static ExtentReports getInstance() {
		String path= "C:\\git projects\\SeleniumPractive\\ExtentReport\\ExtentReport_Instance.html";
		ExtentReports extent= new ExtentReports(path, false);
		extent.addSystemInfo("Selenium Version","4.0");
		extent.addSystemInfo("Platform","Windows");
		return extent;
		
	}
	
	
}
