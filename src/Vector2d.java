import java.util.*;
public class Vector2d {

	public static void main(String[] args) {
		
		
		Vector<String> fvector=new Vector();
		
		fvector.add("A");
		fvector.add("B");
		fvector.add("C");
		fvector.add("D");
		
		
		Vector secvector=new Vector();
		
		secvector.add(fvector);
		System.out.println(secvector);
		for(int i=0;i<fvector.size();i++) {
			String str=(String) ((Vector)secvector.get(0)).get(i);
			System.out.println(str);
			
		}
		
		

	}

}
