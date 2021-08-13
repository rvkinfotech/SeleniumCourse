package coding.programs;

public class FindLengthOfStringAndEach {

	public static void main(String[] args) {
		
		String s1=new String("Hello World!, Here is the Java Program");
		
		System.out.println("Lenght of the String "+s1.length());
		
		String sa[]=s1.split(" ");
		
		for(String s: sa)
		 System.out.println(s+" word length is "+s.length());
		
	}

}
