import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class HashMapSync {
	
	public static void main(String[] args) {
		
		// sychronized map
		
		Map<String,String> map1=new HashMap<String , String>();
		map1.put("1","swara");
		map1.put("2","dali");
		map1.put("3","veda");
		
		// creating a sychronized map
		
		Map<String,String> syncmap=Collections.synchronizedMap(map1);
		
		System.out.println(syncmap);
		
		// Concurrent Hashmap  dosesnt not throw any ConcurrentModificationException
		
		ConcurrentHashMap<String ,String> concurrent=new ConcurrentHashMap();
		 
		concurrent.put("A","apple");
		concurrent.put("b","bpple");
		concurrent.put("c","cpple");
		
		System.out.print(concurrent.get("A"));
		
	}

}
