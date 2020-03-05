package collection_topics;
import java.util.HashMap;
import java.util.Map.Entry;


public class Hashmapconcept {

	public static void main(String[] args) {
		//HashMap is a class Implements Map Interface
		//extends Abstract Map
		//it contains only Unique values
		//Stores values key value bases
		//it may hava one Null key and Multipe Null Values
		//it maintains no Order
		//HashMap is not Synchronised -- not Thread Safe
		//Conncurrent Modification Exeception-- Fail Fast Condition
		
		HashMap<Integer, String> hp = new HashMap<>();
		hp.put(1, "Kranthi");
		hp.put(2, "Mmaidala");
		hp.put(3, "AK");
		
		System.out.println(hp.size());
		System.out.println(hp.get(1));
		
		hp.put(4, "QA");
		System.out.println(hp);
		hp.remove(3);
		System.out.println(hp);
		
		for(Entry<Integer, String> e : hp.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());	
		}
		
		System.out.println("******************");
		HashMap<Integer, employee> emp  = new HashMap<Integer,employee>();
		
		employee e1 = new employee(1, "Kranthi", "QA");
		employee e2 = new employee(2, "Naveen", "Dev");
		employee e3 = new employee(3,"AK","QA");
		
//		HashMap<Integer, employee> emp  = new HashMap<Integer,employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, employee> ob: emp.entrySet()){
			int key = ob.getKey();
			employee em = ob.getValue();
			System.out.println(key+" values");
			System.out.println(em.id+ " "+em.name+ " "+em.dept);	
		}
		
	}

}
