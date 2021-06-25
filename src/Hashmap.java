import java.util.*;
public class Hashmap {
	
	
	public static void main(String[] args) {
		//no order no indexing
		// key and value pair
		//key cannot be duplicate
		// can store many null values but only one null key
		
		
		HashMap<String , String> captial=new HashMap<String,String>();
		captial.put("India","Delhi");
		captial.put("USA","DC");
		captial.put("UK","London");
		captial.put("Japan","Tokyo");
		captial.put("India","fff");
		captial.put(null, "LA");
		captial.put(null, "RIO");
		
		System.out.println(captial.get("India")); // this  will give the latest value
		System.out.println(captial.get(null)); 
		
		
		//iterator
		
		Iterator<String> it=captial.keySet().iterator();
		
		while(it.hasNext()) {
			String key=it.next();
			String value=captial.get(key);
			System.out.println("key="+key + " value="+ value);
		}
		
	}

}