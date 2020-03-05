package Java_Interview;

public class RemoveJunk {

	//Regular Expression: [^a-zA-Z0-9 ]-----> Removes all the chars excludeing given chars.
	
	public static void main(String[] args) {
		String s="Hello!@#$%^&* World";
		System.out.println(s.replaceAll("[^a-zA-Z0-9 ]", ""));	
	}

}
