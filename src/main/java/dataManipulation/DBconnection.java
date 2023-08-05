package dataManipulation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DBconnection {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "{[String=sql]}";
		
		Driver d= new Driver();
		DriverManager.registerDriver(d);
		
		Connection con = DriverManager.getConnection(url, username, password);
		
		ResultSet result = con.createStatement().executeQuery("select * from siva");
		
		String data = result.getString(0);
		
		System.out.println(data);
		
		
		
		
	}

}
