package test;
import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.*;


@RunWith(Cucumber.class)
@CucumberOptions(                            
		/*dryRun=true,
		monochrome=true,*/
		features= "src/main/java/test", 
		glue= {"stepdefinition"}
		)


public class testRunner_loginPage {

}
