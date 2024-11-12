package seleniumConcepts;

//Created generic method for Explicit wait
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_ExplicitGenericMethod2 {
	WebDriver driver;

	public Wait_ExplicitGenericMethod2(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getExplicitWait(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		return element;

	}

	public WebElement getExplicitWait_ElementClickable(By locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

		return element;

	}

}
