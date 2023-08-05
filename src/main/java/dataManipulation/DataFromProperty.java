package dataManipulation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataFromProperty {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f=new FileInputStream("./CommonData.properties.txt");
		Properties p= new Properties();
		p.load(f);
		String Str = p.getProperty("Username");
		System.out.println(Str);
		
	}

}
