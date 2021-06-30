import java.util.*;
import java.util.stream.*;
public class RemoveDuplicates {
	
	public static void main(String args[]) {
		ArrayList<Integer> numbers =new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,5,6,4,7,9,1,3));
		
		// Remove duplicates using LinkedHashSet
		
		LinkedHashSet<Integer> linkedhashset =new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> num_duplicates=new ArrayList<Integer>(linkedhashset);
		
		System.out.println(num_duplicates);
		
		
		// After JDK 8 - we have stream
		
		ArrayList<Integer> marksList=new ArrayList<Integer>(Arrays.asList(1,2,3,2,3,4,5,5,6,2,7));
		List<Integer> marksUnique= marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksUnique);
		
		
		ArrayList<String> l1=new ArrayList<String> (Arrays.asList("A","B","C","D","E","F"));
		ArrayList<String> l2=new ArrayList<String> (Arrays.asList("A","B","C","D","F","E"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		
		System.out.println(l1.equals(l2));
		
		// compare 2 list find out the additional elements
		
		ArrayList<String> l3=new ArrayList<String> (Arrays.asList("A","B","C","D","E","Z"));
		ArrayList<String> l4=new ArrayList<String> (Arrays.asList("A","B","C","D","F","E"));
		
		l3.removeAll(l4);
		System.out.println(l3);
		
		
		// find out the common element
		
		ArrayList<String> l5=new ArrayList<String> (Arrays.asList("A","B","C","D","Y","J"));
		ArrayList<String> l6=new ArrayList<String> (Arrays.asList("A","B","C","D","F","E","L"));
		
		l5.retainAll(l6);
		System.out.println(l5);
		
		
		
		
		
		
		
		
		
	}

}
