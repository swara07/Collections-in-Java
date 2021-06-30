import java.util.*;
public class HashMaptoArrayList {

	public static void main(String[] args) {
		
		HashMap <String,Integer> map1=new HashMap<String,Integer>();
		map1.put("A", 100);
		map1.put("B", 200);
		map1.put("C", 130);
		map1.put("D", 400);
		map1.put("E", 500);
		
		System.out.println("size :"+map1.size());
		
			
		// convert hashmap keys into ArrayList:
		
		List<String> keyList=new ArrayList<String>(map1.keySet());
		
		for(String t: keyList) {
			System.out.println(t);
			
		}
		
		
		// convert hashmap values to ArrayList
		List<Integer> valueList=new ArrayList<Integer>(map1.values());
		System.out.println(valueList);
		
		
		

	}

}
