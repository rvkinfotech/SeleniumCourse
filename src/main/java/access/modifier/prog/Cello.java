package access.modifier.prog;

public class Cello {

	private int a;
	protected int b;
	public int c;
	int d;
	
	public static void main(String[] args) {
	
		Cello cello=new Cello();
		cello.showVaribleValues();
	}
	
	public void showVaribleValues() {
		
		System.out.println("This is Private Variable "+a);
		System.out.println("This is Protected Variable "+b);
		System.out.println("This is Public Variable "+c);
		System.out.println("This is default Variable "+d);
		
	}

}
