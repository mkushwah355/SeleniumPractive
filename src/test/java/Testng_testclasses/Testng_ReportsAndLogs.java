package Testng_testclasses;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testng_ReportsAndLogs {
	@BeforeClass
	public void beforeClass() {
		//System.out.println("Testng_ReportsAndLogs -> This runs once before class");
		Reporter.log("Testng_ReportsAndLogs -> This runs once before class", true);
	}

	@AfterClass
	public void afterClass() {
		//System.out.println("Testng_ReportsAndLogs -> This runs once after class");
		Reporter.log("Testng_ReportsAndLogs -> This runs once after class",true);
	}

	@BeforeMethod
	public void beforeMethod() {
		//System.out.println("Testng_ReportsAndLogs -> This runs before every method");
		Reporter.log("Testng_ReportsAndLogs -> This runs before every method",true);
	}

	@AfterMethod
	public void afterMethod() {
		//System.out.println("Testng_ReportsAndLogs -> This runs after every method");
		Reporter.log("Testng_ReportsAndLogs -> This runs after every method",true);
	}

	@Test
	public void testMethod1() {
		//System.out.println("Testng_ReportsAndLogs -> testMethod1");
		Reporter.log("Testng_ReportsAndLogs -> testMethod1", true);
	}
	@Test
	public void testMethod2() {
		//System.out.println("Testng_ReportsAndLogs -> testMethod2");
		Reporter.log("Testng_ReportsAndLogs -> testMethod2",true);
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods={"testMethod2"})
	public void testMethod3() {
		//System.out.println("Testng_ReportsAndLogs -> testMethod3");
		Reporter.log("Testng_ReportsAndLogs -> testMethod3",true);
	}

}
