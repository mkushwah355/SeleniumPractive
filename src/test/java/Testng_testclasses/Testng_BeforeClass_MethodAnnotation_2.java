package Testng_testclasses;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Testng_BeforeClass_MethodAnnotation_2 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("TestClass2->beforeClass called once");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("TestClass2->afterClass called once");
	}	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("TestClass2->beforeMethod called");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("TestClass2->afterMethod called");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("TestClass2->testMethod1 called");
	}
	@Test
	public void testMethod2() {
		System.out.println("TestClass2->testMethod2 called");
	}
}
