package intermediate;

public class ConstructorWithThis {

	public static String name ="Class Variable";
	
	public ConstructorWithThis(String name) {
		this.name = name;
		System.out.println(name);
	}
	
	public static void main(String[] args) {

		ConstructorWithThis obj = new ConstructorWithThis("Local variable");
		System.out.println(name);
		
	}

}
