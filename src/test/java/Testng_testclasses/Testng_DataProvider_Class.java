package Testng_testclasses;

import org.testng.annotations.DataProvider;

public class Testng_DataProvider_Class {

	@DataProvider(name = "inputData")
	public Object[][] getInput() {
		return new Object[][] { 
			{ "Test1", "Test11" }, 
			{ "Test2", "Test22" }, 
			{ "Test3", "Test33" } };

	}

}
