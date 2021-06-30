import java.util.*;
public class TreeMapConcept {

	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> map=new TreeMap<>();
		
		map.put(100, "swara");
		map.put(200, "swa");
		map.put(20, "swarangi");
		map.put(400, "dali");
		map.put(150, "s");
		
		map.forEach((k,v)->System.out.println("key="+k +" "+"value="+v));
		
		System.out.println(map.lastKey());  //Since it is a tree it stores in sorted order
		System.out.println(map.firstKey());
		
		// headMap important
		Set<Integer> keysLessThan400= map.headMap(400).keySet();
		System.out.println(keysLessThan400);
		
		// tailMap important  *equal to or more than*
		Set<Integer> keysmoreThan20= map.tailMap(20).keySet();
		System.out.println(keysmoreThan20);
		
		
		TreeMap<String,Integer> students=new TreeMap<>();
		
		students.put("Albert",10);
		students.put("Ted",20);
		students.put("Barney",30);
		students.put("Lily",50);
		
		students.forEach((k,v)->System.out.println("key="+k+" value="+v));
		
		// reverse order
		
		TreeMap<String,Integer> reverse=new TreeMap<>(Comparator.reverseOrder());
		
		reverse.put("Albert",10);
		reverse.put("Ted",20);
		reverse.put("Barney",30);
		reverse.put("Lily",50);
				
		reverse.forEach((k,v)->System.out.println("key="+k+" value="+v));
		

	}

}
