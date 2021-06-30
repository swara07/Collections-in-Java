import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {
	
	
public static void main(String[] args) {
	
	 //default generics:
	
	ArrayList<Object> ar=new ArrayList<Object>();
	ar.add(10);
	ar.add(20);
	ar.add(30);
	ar.add(40);
	ar.add(true);
	
	System.out.println(ar);
	System.out.println(ar.get(2));
	System.out.println("Size :"+ar.size());  //size of the array list
	
	ar.add(60);
	ar.add(70);
	
	System.out.println("Size :"+ar.size()); // after adding it size increase so arrayList is dynamic unlike arrays
	
	
	//only integer generic
	
	ArrayList<Integer>  in=new ArrayList<Integer>();
	in.add(100);
	
	// string generic
	ArrayList<String>  names=new ArrayList<String>();
	names.add("Swara");
	names.add("veda");
	names.add("jughead");
	names.add("betty");
	
	System.out.println(in);
	System.out.println(names);
	
	
	//iterating the elements
	// Method 1 : typical for loop
	System.out.println("Using for loop");
	for(int i=0;i<names.size();i++) {
		System.out.println(names.get(i));
	}
	
	
	// Method 2 using different for loop
	System.out.println("Using different for loop");
	for(String s:names) {
		System.out.println(s);
	}
	
	//Method 3 After JDK 8  streams with lamda:
	System.out.println("Using for lamda which is after JDK 8");
	names.stream().forEach(ele->System.out.println(ele));
	

	// Method 4 using Iterator
	System.out.println("Using for iterator");
	Iterator<String> it=names.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
