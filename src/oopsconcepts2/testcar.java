package oopsconcepts2;

public class testcar {

	public static void main(String[] args) {
		// Static Polymorphism or compile time polymorphism
		Audi a= new Audi();
		a.start();
		a.thefsafety();
		a.stop();
		a.refill();
		a.engine();
		
		System.out.println("**********");

		Car c = new Car();
		c.start();
		c.stop();
		c.refill();
		c.engine();
		
		System.out.println("********");
		//Top casting
		Car c1=new Audi();   // Child class obj can be referred by Parent class ref variable is called Run time/Compile time polymorphism.
		c1.start();
		c1.stop();
		c1.refill();
		
		//Down Casting
	//	Audi a1= (Audi)new Car();  // java.lang.ClassCastException:
	//	a1.start();
	}

}
