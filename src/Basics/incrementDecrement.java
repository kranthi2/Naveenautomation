package Basics;

public class incrementDecrement {

	public static void main(String[] args) {

		int i=1;
		int j=i++;   //post increments
		System.out.println(i);
		System.out.println(j);
		
		int k=1;
		int l=++k;   //pre increment
		System.out.println(k);
		System.out.println(l);
		
		
		int a=2;
		int b=a--;   //post decrement
		System.out.println(a);
		System.out.println(b);
	
		int c=2;
		int d=--c;    //post decrement
		System.out.println(c);
		System.out.println(d);
	
	}

}
