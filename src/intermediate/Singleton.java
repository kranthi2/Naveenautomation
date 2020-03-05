package intermediate;

public class Singleton {

	// In Oops, a Singleton class is a class that can have only once Object(Instance of a class) at a time.
	// How to Design Singleton pattern
	//1. Make Constructor as Private
	//2. write a public static method that has return type of object of this singleton class(Lazy Initialization)
	
	private static Singleton singleton_instace = null;
	
	public String str;
	
	private Singleton() {
		str = "Hey im using Singleton class Pattern";
	}
	
	public static Singleton getInstance() {
		if(singleton_instace==null) {
			singleton_instace = new Singleton();
		}
		return singleton_instace;
	}
	
	public static void main(String[] args) {
		Singleton x= Singleton.getInstance();
		Singleton y= Singleton.getInstance();
	    Singleton z= Singleton.getInstance();
	
	    x.str= (x.str).toUpperCase();
	    System.out.println(x.str);
	    System.out.println(y.str);
	    System.out.println(z.str);
	    
	    z.str= (z.str).toLowerCase();
	    System.out.println(x.str);
	    System.out.println(y.str);
	    System.out.println(z.str);
	}

}
