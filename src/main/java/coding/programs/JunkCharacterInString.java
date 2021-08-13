package coding.programs;

public class JunkCharacterInString {

	public static void main(String[] args) {
		
		String str="JAVA@ORACLE#{}";
		System.out.println(str.replace('@',' ').replace('#', ' ').replace('{', ' ').replace('}',' '));
		
		
		/*
		 * System.out.println(str.replace('#',' '));
		 * System.out.println(str.replace('{',' '));
		 * System.out.println(str.replace('}',' '));
		 */
		
		System.out.println(str.replace("#{}", "").replace('@', ' '));
		
		// regular expressions
		System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
		
		
	}

}
