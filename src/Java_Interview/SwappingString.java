package Java_Interview;

public class SwappingString {

	public static void main(String[] args) {

		String a= "Kranthi";
		String b= "Mamidala";
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println(a+"  "+b);
	}

}
