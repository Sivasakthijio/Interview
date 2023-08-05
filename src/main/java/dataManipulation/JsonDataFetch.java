package dataManipulation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataFetch {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader f=new FileReader("./JsonData.json");
		JSONParser j= new JSONParser();
		Object p = j.parse(f);
		HashMap hm= (HashMap) p;
		String un = hm.get("Username").toString();
		String pwd = hm.get("Password").toString();
		String bro = hm.get("Browser").toString();
		System.out.println("Username: "+un+"  "+"Password: "+pwd+" "+"Browser: "+bro);
		
	
	}

}
