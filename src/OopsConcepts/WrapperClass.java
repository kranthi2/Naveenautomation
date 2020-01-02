package OopsConcepts;

public class WrapperClass {

	public static void main(String[] args) {
		
	//	String to int
		String s= "100";
		System.out.println(s+20);
		int i =Integer.parseInt(s);
		System.out.println(i+20);
		
	// String to double	
		String  x="20.33";
		double d= Double.parseDouble(x);
		System.out.println(d+33.12);
		
	// int to String
		
		int a= 30;
		String b= String.valueOf(a);
		System.out.println(b+20);
		
	}

}
