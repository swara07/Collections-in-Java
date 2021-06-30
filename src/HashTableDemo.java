import java.util.*;
public class HashTableDemo {
	
	public static void main(String[] args) {
		
		// no null values or keys
		Hashtable<Integer,String> marks =new Hashtable<>();
		
		marks.put(1, "A");
		marks.put(2, "B");
		marks.put(3, "C");
		marks.put(5, "D");
		marks.put(3, "Z");
		
		System.out.println(marks);
		
	}

}
