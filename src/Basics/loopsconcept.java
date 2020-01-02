package Basics;

public class loopsconcept {

	public static void main(String[] args) {

		//While loop is used when we dont know how many records are there by not mentioning increment
		// disadvantage: if we don't include increment/decrement in while loop, it will generate infinite loops.
		int i=1;  //initialization
		while(i<=10) {   //condition
			System.out.println(i);
			i++;  //increment
		}
		
		System.out.println("**********");
		
		//for loop increment
		for(int j=1;j<=10;j++) {  //initialization, Condition, increment
			System.out.println(j);
		}
		System.out.println("**********");
		
		//for loop decrement
		for(int k=10;k>=1;k--) {
			System.out.println(k);
		}
		
	}

}
