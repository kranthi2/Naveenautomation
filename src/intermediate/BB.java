package intermediate;

public class BB extends AA{

	// super keyword is used to call Parent class Constructor
	public BB() {

		// if u pass anything then default parameter will be passed
		
		//if u pass 1parm then 1 parameter Const will be called
		//super(10);
		
		//if u pass 1parm then 1 parameter Const will be called
		super(10,20);
		
		System.out.println("Child Class const");
	}
	
	public static void main(String[] args) {

		BB obj = new BB();
	}

}
