import java.util.*;

public class HashmapCompare {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> alpha1=new HashMap<Integer,String>();
		alpha1.put(1,"A");
		alpha1.put(2,"B");
		alpha1.put(3,"C");
		alpha1.put(4,"D");
		alpha1.put(5,"E");
		
		HashMap<Integer,String> alpha2=new HashMap<Integer,String>();
		alpha2.put(5,"E");
		alpha2.put(3,"C");
		alpha2.put(4,"D");
		alpha2.put(2,"B");
		alpha2.put(1,"A");
		
		
		HashMap<Integer,String> alpha3=new HashMap<Integer,String>();
		alpha3.put(1,"D");
		alpha3.put(2,"B");
		alpha3.put(3,"C");
		alpha3.put(4,"A");
		alpha3.put(6,"Z");
		
		// comparing key and value 
	
		System.out.println(alpha1.equals(alpha2));  //true
		System.out.println(alpha1.equals(alpha3)); //false
		
		// comparing the keys : the keys should be the same
		System.out.println(alpha1.keySet().equals(alpha2.keySet())); //true
		System.out.println(alpha1.keySet().equals(alpha3.keySet())); //false
		
		
		// find out extra keys
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1,"D");
		map1.put(2,"B");
		map1.put(3,"C");
		map1.put(5,"A");
		map1.put(6,"Z");
		
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		map2.put(1,"D");
		map2.put(2,"B");
		map2.put(3,"C");
		map2.put(4, "J");
		
		//first combine the hashmaps into  hashset  only keys
		
		HashSet<Integer> map3=new HashSet<Integer>(map1.keySet());
		
		map3.addAll(map2.keySet());
		map3.removeAll(map1.keySet());
		
		System.out.println(map3); //this will find extra in map2
		
	   HashSet<Integer> map4=new HashSet<Integer>(map2.keySet());
		
		map4.addAll(map1.keySet());
		map4.removeAll(map2.keySet());
		System.out.println(map4);   //this will find extra in map1
		
		// now combine map4 and map3
		
		map3.addAll(map4);
		System.out.println("not common items are: "+map3);
		
		// Compare maps by values:
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
