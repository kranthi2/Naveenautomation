package OopsConcepts;

public class classAndObject {

	int mod;
	int eng;
	
	public static void main(String[] args) {
		
	//	classAndObject()  is the Object
	//	new is use to create the Object
	//  obj,obj1,obj2 are the object Reference variable
		
		classAndObject obj = new classAndObject();
		classAndObject obj1 = new classAndObject();
		classAndObject obj2 = new classAndObject();

		obj.mod=2015;
		obj.eng=3;

		obj1.mod=2016;
		obj1.eng=4;
		
		obj2.mod=2017;
		obj2.eng=5;
		
		
		System.out.println(obj.mod);
		System.out.println(obj.eng);
		
		System.out.println(obj1.mod);
		System.out.println(obj1.eng);
		
		System.out.println(obj2.mod);
		System.out.println(obj2.eng);
	}

	
}
