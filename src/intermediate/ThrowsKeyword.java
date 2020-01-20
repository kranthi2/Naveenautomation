package intermediate;

public class ThrowsKeyword {

	public static void main(String[] args) throws ArithmeticException{

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("Throws Keyword");
	}

	public void m1() throws ArithmeticException{
		try {
			m2();
		} catch (Exception e) {
		}
	}
	
	public void m2() throws ArithmeticException {
		int i=9/0;
	}
}
