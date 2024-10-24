package Testng_testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;

public class Testng_ITestResultDemo {
	@Test
	public void testMethod1() {
		System.out.println("testMethod1");
		Assert.assertTrue(false); //failing this test method
	}

	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if(testResult.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed testCase: "+ testResult.getName());
			
		}else if(testResult.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Successful testCase: "+ testResult.getName());
		}
		
		//System.out.println(testResult.getMethod().getMethodName());

	}
}
