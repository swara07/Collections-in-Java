import java.util.*;

public class LinkedListFunc {

	public static void main(String[] args) {

		// Linked List allows null entry
		// dynamic collection
		// insertion and deletion can be easy
		// can contain duplicate elements
		// it is not synchronized
		
		LinkedList<String> names= new LinkedList<String>();
		names.add("swara");
		names.add("ross");
		
		System.out.println("Size="+names.size());
		System.out.println(names);
		System.out.println(names.get(1));
		
		System.out.println("Using iterator");
		Iterator it=names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// adding element in the middle
		names.add(1,"rachel");
		System.out.println(names);
		
		
		// add at the first position or last position
		
		names.addFirst("dali");
		names.addLast("monica");
		System.out.println(names);
		
		//remove element
		names.remove("dali");
		System.out.println(names);
		
		System.out.println("Using JDK 8 lamda");
		names.forEach(ele->System.out.println(ele));
		
		// you can also sort 
		
		Collections.sort(names);
		System.out.println(names);
		
		
	}

}
