package collection_topics;
 import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> series = new ArrayList<>();
		series.add("Friends");
		series.add("Game of Thrones");
		series.add("Dexture");
		series.add("The Big Bang Theory");
		
		
		//1.using java 8 with for each loop and lambda in java 8
		System.out.println("****1.using java 8 with for each loop and lambda in java 8**");
		series.forEach(show ->{
			System.out.println(show);
		});
		
		//2.using Iterator
		System.out.println("***2.using Iterator****");
		Iterator<String> show = series.iterator();
		while(show.hasNext()) {
			System.out.println(show.next());
		}
		
		//3.using Iterator and java8 lambda and foreachReamaining() method  
		System.out.println("3.using Iterator and java8 lambda and foreachReamaining() method");
		
		Iterator<String> it =series.iterator();
		it.forEachRemaining(show1 ->{
			System.out.println(show1);
		});
		//4.foreach loop
		System.out.println("4.Foreach loop");
		for(String show2:series) {
			System.out.println(show2);
		}
		
		//5.using forloop with order/Index
		System.out.println("5.using for loop with order/Index");
		for(int i=0;i<series.size();i++) {
			System.out.println(series.get(i));
		}
		
		//6.using a listIterator() to travese in both the Direction
		System.out.println("6.using a listIterator() to travese in both the Direction");
		ListIterator<String> serieslist= series.listIterator(series.size());
		while(serieslist.hasPrevious()) {
			System.out.println(serieslist.previous());
		}
	}

}
