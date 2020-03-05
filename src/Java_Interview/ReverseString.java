	package Java_Interview;

public class ReverseString {

	public static void main(String[] args) {

		String s="KRANTHI";
		
		// Using For loop
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev= rev+s.charAt(i);
			
//			System.out.print(s.charAt(i));
		}
		System.out.println(rev);
		
		
		//Using String Buffer Class
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
