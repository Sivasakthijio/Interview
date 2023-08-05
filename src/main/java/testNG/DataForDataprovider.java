package testNG;

import org.testng.annotations.DataProvider;

public class DataForDataprovider {
	
	@DataProvider(name= "siva")
	Object[][] bookTicketDataProvider()
	{
		Object[][] objArr = new Object[5][2];
		
		objArr[0][0] = "Chennai";
		objArr[0][1] = "Bangalore";
		
		objArr[1][0] = "Chennai";
		objArr[1][1] = "Mysore";
		
		objArr[2][0] = "Chennai";
		objArr[2][1] = "Mumbai";
		
		objArr[3][0] = "Chennai";
		objArr[3][1] = "Pune";
		
		objArr[4][0] = "Chennai";
		objArr[4][1] = "Kerala";
		
		return objArr;
	}
}
