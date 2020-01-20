package intermediate;


public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("ABC");
		
		try {
			throw new Exception("Kranthi Exc");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("PQR");
		
		String Exec_flag=" ";
		if(Exec_flag.equals(" ")) {
			try {
				throw new Exception("Contains Blank");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Test");
		
	}

}
