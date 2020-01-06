package collection_topics;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

import javax.swing.plaf.BorderUIResource.EmptyBorderUIResource;

public class HashtableConcept {

	public static void main(String[] args) {

		//it is similar to HashMap but Synchronised
		//Stores values on basis of Key, value
		//Key-->Object -->HashCode--> Value
		
		
		 Hashtable ht1 = new Hashtable();
		ht1.put(1, "kranthi");
		ht1.put(2, "Mamidala");
	
		System.out.println(ht1.size());
		System.out.println(ht1.get(1));
		
		// Create a Clone copy/shallow Copy
		
		Hashtable ht2 = new Hashtable();
		ht2=(Hashtable) ht1.clone();
		
		System.out.println("The values of Ht1 are "+ht1);
		System.out.println("The values of Ht2 are "+ht2);
		
		ht1.clear();

		System.out.println("The values of Ht1 are "+ht1);
		System.out.println("The values of Ht2 are "+ht2);
		
		Hashtable st = new Hashtable<>();
		st.put("A", "Developer");
		st.put("B", "QA Enginner");
		st.put("C", "DB Developer");
		
		if(st.containsValue("Developer")) {
			System.out.println("value Found");
		}
		// print all values from Hashtable using Emuneration -- elemet()
		System.out.println("Print values using Enumeration");
		Enumeration en= st.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		 // print All the values from Hashtable using entryset()--set of Hashtable
			Set s= st.entrySet();
			System.out.println(s);
			
			Hashtable st1 = new Hashtable<>();
			st1.put("A", "Developer");
			st1.put("B", "QA Enginner");
			st1.put("C", "DB Developer");	
			//it contains only unique value
			//st1.put(null, "Okay");
			//st1.put("D", null);  //Null pointer Exception 
			
			//check both the hashtables are equal
		if(st.equals(st1)) {
			System.out.println("Both are same");
		}
		System.out.println(st1.get("A"));
		System.out.println(st1.hashCode()); // to get the hashcode
	}

}
