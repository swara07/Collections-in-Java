import java.util.*;
public class VectorBasics {

	public static void main(String[] args) {
		
		Vector<Integer> myvector=new Vector<Integer>();
		myvector.add(2);
		myvector.add(4);
		myvector.add(8);
		myvector.add(9);
		myvector.add(5);
		myvector.add(1);
		myvector.add(7);
		
		System.out.println(myvector);
		
		System.out.println(myvector.get(3));
		
		Vector<Integer> v1=new Vector<Integer>();
		v1.add(10);
		v1.addAll(myvector);
		System.out.println(v1);
		
		

	}

}
