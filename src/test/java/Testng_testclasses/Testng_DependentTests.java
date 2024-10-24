package Testng_testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import Testng_appCode.SomeClassToTest;

public class Testng_DependentTests {
	
	SomeClassToTest S1; //we are creating object of SomeClassToTest class.
	
	@Test(dependsOnMethods = "testMethod2", alwaysRun=true)
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		S1= new SomeClassToTest();
		int result= S1.sumNumbers(2, 3);   //calling the method of SomeClassToTest 
		Assert.assertEquals(result, 4);    //this test will fail
	}
	@Test
	public void testMethod3() {
		System.out.println("testMethod3");
	}
	@Test
	public void testMethod4() {
		System.out.println("testMethod4");
	}
}