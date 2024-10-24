package Testng_testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testng_EnableTimeout {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}	
	
	
	@Test(enabled=false)
	public void testMethod1() {
		System.out.println("testMethod1");
	}
	
	@Test(timeOut=1000)
	public void testMethod2() throws InterruptedException {
		System.out.println("testMethod2");
		Thread.sleep(2000); //This test will fail due to timeout=1 sec. Thread.sleep will make him wait for 2 sec.
	}
}
