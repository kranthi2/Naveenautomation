package collection_topics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {

	public static void main(String[] args) {

		int a[] = new int[3]; // Static Array
		
		
		//Dynamic Array----ArryList
		//can contain Duplicate values
		//maintains insertion order
		//Synchronized
		//allows random access to fetch the element because it stores the values on basis on index
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add("Kranthi");
	
		System.out.println(ar.size());
		
		ar.add('K');
		ar.add(true);
		System.out.println(ar.size()); // Size of array
		System.out.println(ar.get(2)); //to get a value from index
		System.out.println("**************");
		
		//to print all values from Arraylist
				//1) for loop
				//2) Using Iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//Generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(200);
	//	ar1.add("String");
		
		//employee class object
		
		employee emp = new employee(1, "Kranthi", "QA");
		employee emp1 = new employee(2, "Naveen", "Dev");
	
		ArrayList<employee> ar3 = new ArrayList<employee>();
		ar3.add(emp);
		ar3.add(emp1);
		
	
	Iterator<employee> it=	ar3.iterator();
	
	while(it.hasNext()) {
		employee em=it.next();
		System.out.println(em.id);
		System.out.println(em.name);
	}
	
	}

}
