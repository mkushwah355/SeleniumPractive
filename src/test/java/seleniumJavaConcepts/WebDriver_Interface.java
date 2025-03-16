package seleniumJavaConcepts;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//WebDriver (Interface) abstract method
class WebDriver_Interface implements WebDriver {
	public void get(String url) {}
	public String getTitle() {return null;}
	public String getCurrentUrl() {return null;}	
	public String getPageSource() {return null;}
	public WebElement findElement(By by) {return null;}
	public List<WebElement> findElements(By by) {return null;}
	public String getWindowHandle() {return null;}
	public Set<String> getWindowHandles() {return null;}	
	public TargetLocator switchTo() {return null;}//It returns an instance of TargetLocator, which allows you to switch the context within the browser, such as switching between windows, frames, or alerts.
	public Navigation navigate() {return null;}//This method provides access to a Navigation object, which allows you to control browser navigation, such as moving back and forth in the browser history, refreshing the page, and navigating to a new URL.
	public Options manage() {return null;}//This method provides access to an Options object, which allows you to manage various browser settings, such as cookies, timeouts, and window operations.
	public void close() {}
	public void quit() {}
}
