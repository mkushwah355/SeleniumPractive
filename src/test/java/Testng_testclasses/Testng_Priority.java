package Testng_testclasses;

import org.testng.annotations.Test;

public class Testng_Priority {

	@Test(priority = 3)
	public void testMethod1() {
		System.out.println("testMethod1");
	}

	@Test(priority = -1)
	public void testMethod2() {
		System.out.println("testMethod2");
	}

	@Test(priority = 0)
	public void testMethod3() {
		System.out.println("testMethod3");
	}

}
