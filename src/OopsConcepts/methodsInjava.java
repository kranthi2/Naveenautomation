package OopsConcepts;

public class methodsInjava {

	public static void main(String[] args) {

		//Non Static Method
		
		methodsInjava obj = new methodsInjava();
		//one object is created, obj is the ref variable..refering to this object
		//after creating object, the copy of all non static methods will be given to this Object
			obj.m1();
			
			int d=10+obj.m2();
			System.out.println(d);
			
			int z=obj.m3(100, 200);
		System.out.println(z);
	}
	
	public void m1() {      //no i/p, no o/p
		//void ----does not return any value
		//return type = void
		System.out.println("This is Methid m1");
	}
	
	public int m2() {   	//no i/p, some o/p
		//return type = int
		System.out.println("This is Method m2");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public int m3(int x,int y) { //some i/p, Some o/p
		//return type = int
		System.out.println("This is Method m3");
		return x+y;
	}

}
