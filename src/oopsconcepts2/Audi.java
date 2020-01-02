package oopsconcepts2;

public class Audi extends Car{
	// has-A relation
	//when method is present is parent and child class with same method name and same no.of arguments are called as method over riding
	
	public void start() {  // over ridden method
		System.out.println("Audi Start Method");
	}
	
	public void thefsafety() {
		System.out.println("Audi theft Safety Methid ");
		
	}
}
