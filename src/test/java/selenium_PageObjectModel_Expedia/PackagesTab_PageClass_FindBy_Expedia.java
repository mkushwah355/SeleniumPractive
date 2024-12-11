package selenium_PageObjectModel_Expedia;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//It is page class for "Packages" tab of "Expedia" website using @FindBy. 


public class PackagesTab_PageClass_FindBy_Expedia {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"multi-product-search-form-1\"]/div/div/div/div/div[1]/ul/li[4]/a")
	WebElement packagesTab;
	
	@FindBy(xpath="//*[@id=\"package-search-form\"]/div[1]/div[1]/div/div[1]/div/div/div/div[1]/button")
	WebElement leavingFromButton;
	
	@FindBy(xpath="//*[@id=\"origin_select\"]")
	WebElement fillLeavingFromInput;
	
	@FindBy(xpath="//*[@id=\"package-search-form\"]/div[1]/div[1]/div/div[2]/div/div/div/div[1]/button")
	WebElement goingToButton;
	
	@FindBy(xpath="//*[@id=\"destination_select\"]")
	WebElement fillGoingToInput;
	
	@FindBy(xpath="//*[@id=\"search_button\"]")
	WebElement searchButton;

//Initialize the WebDriver	
	PackagesTab_PageClass_FindBy_Expedia(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickPackagesTab() {
		packagesTab.click();
	}
	
	public void clickLeavingFromButton() {
		leavingFromButton.click();
	}
	
	public void fillLeavingFrom(String origin) {
		fillLeavingFromInput.sendKeys(origin);
		//fillLeavingFromInput.sendKeys(Keys.ENTER);//It is not working in test case. Need to check it
	}
	
	public void clickGoingToButton() {
		goingToButton.click();
	}
	
	public void fillGoingToButton(String destination) {
		fillGoingToInput.sendKeys(destination);
		//fillLeavingFromInput.sendKeys(Keys.ENTER);//It is not working in test case. Need to check it
	}
	public void clickSearchButton() {
		searchButton.click();
	}
	
	public WebDriver getDriver(WebDriver driver){
		return driver;
	}
	
	
	
}
