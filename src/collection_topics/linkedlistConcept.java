package collection_topics;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistConcept {

	public static void main(String[] args) {
		LinkedList<Object> ll= new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add("String");
		ll.add('A');
		
		System.out.println(ll);
		ll.addFirst(5);
		ll.addLast(true);
		
		System.out.println(ll);
		
		System.out.println(ll.get(0));
		ll.set(1, "Set");
		System.out.println(ll.get(1));
		
		// Print All the values in LinkedList
		//for Loop
		System.out.println("*******For Loop***********");
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		//Advanced for loop
		System.out.println("*********Advanced for loop*********");
		for(Object obj:ll) {
			System.out.println(obj);
		}
		
		//While Loop
		System.out.println("*********While Loop*********");
		int j=0;
		while(j<ll.size()) {
			System.out.println(ll.get(j));
			j++;
		}
		
		//Iterator
		System.out.println("*********Iterator*********");
		Iterator<Object> it= ll.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
