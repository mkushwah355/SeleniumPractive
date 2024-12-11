package selenium_PageObjectModel_Expedia;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//It is a page class for "Flights" tab of "Expedia" website. All the elements(Objects) of "Flight" tab converted into reusable method.
//It is object repository of "Flight" tab. We are using below reusable methods in our "PageObjectModel_TestCase1" test case.

public class FlightsTab_PageClass_Expedia {
	public static WebElement element = null;

//Returns the "Flights" tab element
	public static WebElement clickOnFlightTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"multi-product-search-form-1\"]/div/div/div/div/div[1]/ul/li[2]/a/span"));
		return element;
	}

//Click on "Leaving from" button type box element
	public static WebElement clickOnleavingFromButtonBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[1]/div/div/div/div[1]/button"));
		element.click();
		return element;
	}
	
//Fill the "Leaving From" text box with "origin" variable
	public static void fillLeavingFromTextBox(WebDriver driver, String origin) {
		element = driver.findElement(By.xpath("//*[@id=\"origin_select\"]"));
		element.sendKeys(origin);
		element.sendKeys(Keys.ENTER); //Pressing keyboard "Enter" button after filling the text.
	}

//Click on "Going to" button box element	 
	public static WebElement clickGoingToButtonBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[1]/div/div[2]/div/div/div/div[1]/button"));
		element.click();
		return element;
	}
	
//Fill the "Going To" text box with "destination" variable
	public static void fillGoingToTextBox(WebDriver driver, String destination) {
		element = driver.findElement(By.xpath("//*[@id=\"destination_select\"]"));
		element.sendKeys(destination);
		element.sendKeys(Keys.ENTER);//Pressing keyboard "Enter" button after filling the text.
	}

//Returns the flight "Dates" text box element
	public static WebElement datesBoxButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[2]/div/div/div/div/button"));
		return element;
	}

//Returns the flight "Travelers" text box element
	public static WebElement travelersBoxButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"FlightSearchForm_ROUND_TRIP\"]/div/div[3]/div/div[1]/button"));
		return element;
	}

//Returns the "Search" button element
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"search_button\"]"));
		return element;
	}

//Click on "Search" button
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}
	
//Return the "driver" instance
	public static WebDriver driverGetInstance(WebDriver driver) {
		return driver;
	}

}
