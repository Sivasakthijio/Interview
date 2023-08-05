package stringProgram;

public class siVAsaKThi {
	 public static void alternateCase(String str) {
	        
		 StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);

	            if (i % 4 < 2) {
	            	//System.out.println("if"+i%4);
	                //result.append(Character.toLowerCase(c));
	            	c = str.charAt(i);
	            } else {
	            	//System.out.println("else"+i%4);
	                //result.append(Character.toUpperCase(c));
	            	c=(char)(c-32);
	            }
	            System.out.print(c);
	        }
	        
	        
	    }

	   
	public static void main(String[] args) {
		 String input = "sivasakthi";
	        alternateCase(input);
	        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String str = "sivasakthi";
		 * 
		 * StringBuilder result = new StringBuilder();
		 * 
		 * for (int i = 0; i < str.length(); i++) { char c = str.charAt(i);
		 * 
		 * if (i % 2 == 0) { result.append(Character.toLowerCase(c)); } else {
		 * result.append(Character.toUpperCase(c)); } }
		 * 
		 * String string = result.toString(); System.out.println(string);
		 */		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * String s="sivasakthi"; char[] ch=s.toCharArray(); for(int
		 * i=0;i<s.length();i++) {
		 * 
		 * if(i%2==0) { ch[i]=(char) (ch[i]-32); System.out.println(ch[i]); }else {
		 * System.out.println(ch[i]); }
		 * 
		 * } //System.out.print(ch);
		 */}

}
