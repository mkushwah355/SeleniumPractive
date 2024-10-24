package Testng_testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Testng_Grouping {

	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@Test(groups= {"cars","suv"})
	public void testBMW() {
		System.out.println("BMW");
	}

	@Test(groups= {"cars","sedan"})
	public void testAudi() {
		System.out.println("Audi");
	}

	@Test(groups= {"bikes"})
	public void testPulser() {
		System.out.println("Pulser");
	}

	@Test(groups= {"bikes"})
	public void testKTM() {
		System.out.println("KTM");
	}

	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("After Class");
	}

}
