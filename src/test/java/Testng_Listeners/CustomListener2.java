package Testng_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener2 implements ITestListener {

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

}
