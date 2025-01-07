package Testng_testclasses;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Testng_appCode.SomeClassToTest;

public class Testng_Assert_SoftAssert {

	@Test
	public void testSum() {
		System.out.println("testSum method called");
		SoftAssert sa= new SoftAssert();
		SomeClassToTest S1= new SomeClassToTest();
		int result= S1.sumNumbers(1, 2);
		sa.assertEquals(result,2);
		System.out.println("line after assert 1");//Soft(verify) assert will not stop execution here.
		sa.assertEquals(result,3);
		System.out.println("line after assert 2");
		sa.assertAll();  //assertAll() will collect all the failure of @Test and print in console after failing the @Test.
	}
	
	@Test
	public void testString() {
		System.out.println("testString method called");
		String expected= "Hello world";
		SomeClassToTest S1= new SomeClassToTest();
		String result= S1.addStrings("Hello", "world");
		Assert.assertEquals(result, expected);
	}
	@Test
	public void testArrays() {
		System.out.println("testArrays method called");
		int []expectedArray= {1,2,3};
		SomeClassToTest S1= new SomeClassToTest();
		int []result = S1.getArray();
		Assert.assertEquals(result, expectedArray);
		System.out.println("End of testArrays");
		
	}
	
	

}
