package Testng_testclasses;

import org.testng.annotations.Test;
import Testng_appCode.SomeClassToTest;

public class TestAnnotaion {

	@Test
	public void testMethod1() {
		SomeClassToTest S1= new SomeClassToTest();
		int result=S1.sumNumbers(2, 1);
		System.out.println("Test method 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("Test method 2");

	}

	@Test

	public void testMethod3() {
		System.out.println("Test method 3");
	}

}