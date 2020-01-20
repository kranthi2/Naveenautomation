package intermediate;

public class ExecptionHandling {

	int j=20;
	
	public static void main(String[] args) {

		//uncaught Exception
//		int i=9/0;
//		System.out.println(i);
		
		//Caught Exception
//		Thread.sleep(2000);
		
//		ExecptionHandling obj = new ExecptionHandling();
//		obj=null;
//		System.out.println(obj.j);
		
		//1. Try-Catch Block
		// Throwable is the Super Class of error class and Exception.
		// AtArithmeticException, Null pointer Exception are the child class of Exception class
		
		try{
			int i=9/0;
		System.out.println(i);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("ABC");
	}

}
