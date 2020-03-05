package Java_Interview;

public class SwapingInt {

	public static void main(String[] args) {

		// By using 3rd var
		
		int a=10;
		int b=20;
		int c;
		
//		c=a;
//		a=b;
//		b=c;
//		System.out.println(a+"   "+b);
		
		
//		a=a+b;  //a=30
//		b=a-b;   //b=10
//		a=a-b;
//		
//		System.out.println(a+"   "+b);

	// using XOR
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a+"   "+b);

		
	}

}
