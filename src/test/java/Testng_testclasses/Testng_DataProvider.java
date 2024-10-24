package Testng_testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng_DataProvider {

	/*	@DataProvider(name = "inputData")
		public Object[][] getInput() {
			return new Object[][] { 
				{ "Test1", "Test11" }, 
				{ "Test2", "Test22" }, 
				{ "Test3", "Test33" } };
		}*/

	@Test(dataProvider="inputData",dataProviderClass = Testng_DataProvider_Class.class)
	public void testMethod1(String input1, String input2) {
		System.out.println("Input1: " + input1);
		System.out.println("Input2: " + input2);

	}

}
