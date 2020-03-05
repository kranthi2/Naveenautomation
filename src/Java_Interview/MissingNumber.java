package Java_Interview;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,5};
		int num1=0;
		int num2=0;
		
		for(int i=0;i<a.length;i++) {
			num1=num1+a[i];
		}
		System.out.println(num1);
		
		
		for(int j=1;j<=5;j++) {
		 num2=num2+j;
		}
		System.out.println(num2);
	
	System.out.println("Missing Number is "+(num2-num1));
	}

}
