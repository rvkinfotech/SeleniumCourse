package coding.programs;

public class CountNoWords {

	public static void main(String[] args) {
		String s1=new String("Hello World!, Here is the Java Program");
		
		String sArray[]=s1.split(" ");
		
		System.out.println("No of Words in String "+s1.split(" ").length);
		
		
		System.out.println("No of Words in String "+sArray.length);
		

	}

}
