package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

		@Test (dataProvider = "siva", dataProviderClass = DataForDataprovider.class)
		public void ticketBooking(String src, String dest)
		{
			System.out.println("Ticket booking confirmed from "+src+" to "+dest);
			System.out.println("Have a safe journey");
		}
		
}