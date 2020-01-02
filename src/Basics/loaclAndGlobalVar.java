package Basics;

public class loaclAndGlobalVar {

	int a=10;            // Global OR Class variable
	String s="Kranthi";
	
	public static void main(String[] args) {
		
		int x=20;    //Local variable
		String s="AK";
		System.out.println(x+s);
		
		loaclAndGlobalVar obj = new loaclAndGlobalVar();
		System.out.println(obj.s);
		
		
	}

	public void m1() {
		int i=20;   //Local variable
		int j=30;
		
	}
}
