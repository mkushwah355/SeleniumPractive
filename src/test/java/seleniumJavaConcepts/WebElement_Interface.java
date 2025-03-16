package seleniumJavaConcepts;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

//WebElement (Interface) abstract method
class WebElement_Interface implements WebElement {
	public void sendKeys(CharSequence... keysToSend) {}
	public void click() {}
	public void submit() {}
	public void clear() {}
	public String getText() {return null;}
	public String getTagName() {return null;}
	public String getAttribute(String name) {return null;}
	public String getCssValue(String propertyName) {return null;}
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {return null;}
	public boolean isSelected() {return false;}
	public boolean isEnabled() {return false;}
	public boolean isDisplayed() {return false;}
	public List<WebElement> findElements(By by) {return null;}
	public WebElement findElement(By by) {return null;}
	public Point getLocation() {return null;}//used to retrieve the location of a web element on the web page in terms of its x and y coordinates.
	public Dimension getSize() {return null;}//It is used to retrieve the dimensions of a web element, such as its width and height.
	public Rectangle getRect() {return null;}//It is used to retrieve the bounding rectangle of an element on the web page, including its position and dimensions (i.e., x and y coordinates, width, and height).
	
}
