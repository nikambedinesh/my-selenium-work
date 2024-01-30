package com.dataprovider.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@Test(priority = 1,dataProvider ="testdata")
	
	public void loginTest(int id,String username,String password) {
		
		
		System.out.println("Id ::"+id+ "\t username :: "+username+ "\t password::" +password);
		
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] testData(){
		return new Object[][] {
			
			{9,"dinesh","123"},
			{8,"onkar","456"},
			{7,"rohit","789"},
			
		};
	}

}
