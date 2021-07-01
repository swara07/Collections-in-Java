import java.util.*;
public class EnumSetBasics {


	// abstract set
   // not synchronized
  // faster than Hashset
  // all methosed implemented using bitwise operator
	
	enum lang{
		A,
		B,
		C,
		D,
		
	}
	
	public static void main(String[] args) {
		
		// create a new enumset
		EnumSet<lang> langs=EnumSet.allOf(lang.class);
		System.out.println(langs);
		
		EnumSet<lang> l =EnumSet.noneOf(lang.class);
		System.out.println(l);
		
		// range method
		EnumSet rangee= EnumSet.range(lang.A, lang.C);
		System.out.println(rangee);
		
		//add and addAll method
		
		EnumSet lang1=EnumSet.allOf(lang.class);
		EnumSet lang2=EnumSet.noneOf(lang.class);
		lang2.addAll(lang1);
		System.out.println(lang2);
		
		
		// how to iterate
		
		EnumSet<lang> iter=EnumSet.allOf(lang.class);
		System.out.println("Print using iterator");
		Iterator it= iter.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// remove and removeAll()
		System.out.println("removing elements");
		System.out.println(lang2);
		lang2.remove(lang.A);
		System.out.println(lang2);
		
		
		
		
		
		
		
		
		
	}
}

