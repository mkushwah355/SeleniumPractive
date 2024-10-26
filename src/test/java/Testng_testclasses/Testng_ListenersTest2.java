package Testng_testclasses;

import org.testng.annotations.Test;
import Testng_Listeners.CustomListener2;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(CustomListener2.class)
public class Testng_ListenersTest2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Code in before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Code in after class");
	}

	@Test
	public void testMethod1() {
		System.out.println("Code in testMethod1");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethod2() {
		System.out.println("Code in testMethod2");
		Assert.assertTrue(false);
	}

}
