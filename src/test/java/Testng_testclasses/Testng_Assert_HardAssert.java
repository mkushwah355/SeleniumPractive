package Testng_testclasses;
import org.testng.annotations.Test;
import org.testng.Assert;
import Testng_appCode.SomeClassToTest;
public class Testng_Assert_HardAssert {

	@Test
	public void testSum() {
		System.out.println("testSum method called");
		SomeClassToTest S1= new SomeClassToTest();
		int result= S1.sumNumbers(1, 2);
		Assert.assertEquals(result,2);
		System.out.println("line after assert 1");//Hard(Assert) assert will stop execution here
		Assert.assertEquals(result,3);
		System.out.println("line after assert 2");
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
