package OopsConcepts;

public class staticNonStatic {

	// the Scope Global Variable will be available across all the functions with some conditions

	static int i=10;
	int j=20;

	public static void main(String[] args){

	// Non Static variables and Methods
	 staticNonStatic obj = new staticNonStatic();
	 obj.m1();
	 System.out.println(obj.j);
	 
	 // Static variable and methods 
	 // Direct calling
	 
		m2();
		System.out.println(i);
		
	// Calling by class name	
		staticNonStatic.m2();
		System.out.println(staticNonStatic.i);
	}

	void m1(){
	System.out.println("Non Static Method");
	}

	static void m2(){
	System.out.println("Static Method");
	} 
}
