package Testng_testclasses;

import org.testng.annotations.Test;

public class Testng_TestParallel_2 {
	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("Testng_TestParallel_2-> testMethod1");
		Thread.sleep(6000);
		System.out.println("Testng_TestParallel_2-> testMethod1-> MoreSteps");

	}
	
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("Testng_TestParallel_2-> testMethod2");
		Thread.sleep(6000);
		System.out.println("Testng_TestParallel_2-> testMethod2-> MoreSteps");

	}
}
