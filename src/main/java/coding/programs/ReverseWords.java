package coding.programs;

public class ReverseWords {

	public static void main(String[] args) {
		
		String str="Hello World, Here introducing new apple phone";
		String word[]=str.split(" ");
		for(int j=0;j<word.length;j++) {
		for(int i=word[j].length()-1;i>=0;i--)
			System.out.print(word[j].charAt(i));
		}
	}

}
