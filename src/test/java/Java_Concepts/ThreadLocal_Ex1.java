package Java_Concepts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.ArrayList;
import java.util.Set;

public class ThreadLocal_Ex1 {
    public static void main(String[] args) throws InterruptedException {
    	
    	WebDriver driver;
    	
//ThreadLocal<WebDriver> instance is created. This ThreadLocal object will store the WebDriver instance for the current thread.    	
    	ThreadLocal<WebDriver> threadLocal= new ThreadLocal<>();
    	
//new WebDriver instance for the Chrome browser is created using new ChromeDriver(). This launches a Chrome browser window.
   	   	driver= new ChromeDriver();
   	   	
//The set() method is used to store the newly created WebDriver instance into the ThreadLocal container.
//the thread accessing this ThreadLocal object has its own isolated WebDriver instance.
   	   	threadLocal.set(driver);    	
 
//The get() method retrieves the WebDriver instance stored in the ThreadLocal for the current thread.
//The manage().window().maximize() method maximizes the browser window.
   	   	
  	   	threadLocal.get().manage().window().maximize();    	
  	   	
//The remove() method is called to clear the WebDriver instance from the ThreadLocal storage for the current thread. 
//This step is crucial for preventing memory leaks, especially when the thread completes execution.  	   	
    	threadLocal.remove();   	
    	
    }
}