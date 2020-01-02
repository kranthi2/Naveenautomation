package Basics;

public class ifconditions {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		//&& if both the conditions are true
		if(a>b&&a>c) {
			System.out.println("A is greater");
		}else if(b>c) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
		
		
		// || if any one is True
		if(a>b||a<c){
			System.out.println("any of the one condition is true");
		}else {
			System.out.println("none of the one condition is true");
		}
		
		
		if(a==b){
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
	}
}
