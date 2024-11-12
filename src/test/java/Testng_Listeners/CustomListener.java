package Testng_Listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements IInvokedMethodListener,ITestListener, ISuiteListener{

//	IInvokedMethodListener interface method implementation
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("beforeInvocation: "+testResult.getTestClass().getName()
				+ "=>"+method.getTestMethod().getMethodName());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("afterInvocation: "+testResult.getTestClass().getName()
				+ "=>"+method.getTestMethod().getMethodName());
		
	}
	
//	ITestListener interface method implementation	
	@Override
	public void onTestStart(ITestResult result) {
		// When test method (i.e. @Test) starts
		System.out.println("onTestStart-> Test name: " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// if test method successful
		System.out.println("onTestSuccess-> Test name: " + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// if test method failed
		System.out.println("onTestFailure-> Test name: " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// if test method failed.

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// ignore this. If 5 assertion pass out of 6 then w can use this.

	}

	@Override
	public void onStart(ITestContext context) {
		// Before <test> of xml file
		System.out.println("onStart(second last method)-> Test tag name: " + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		// After <test> of xml file
		System.out.println("onFinish-> Test tag name: " + context.getName());

	}
	
// ISuiteListener interface method implementation	
	
	@Override
	public void onStart(ISuite suite) {
		// When <suite> tag starts
		System.out.println("onStart: before suite starts");

	}

	@Override
	public void onFinish(ISuite suite) {
		// When <suite> tag completes
		System.out.println("onFinish: before suite completes");

	}

	

}
