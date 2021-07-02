import java.util.*;
import java.util.stream.Stream;

public class StreamConcept {

	public static void main(String[] args) {

		// Streams is available after JDK 8
		
		Stream.of(1,2,3,4,5,6,7,8,9).filter(e->e%2==0).forEach(ele->System.out.println(ele));
		
		Stream.of("hello","java")
		.map(e-> e+"world")
		.forEach(System.out::println);
	
	
	
	// optional
	String s[]=new String[5];
	s[2]="swara";
	Optional<String> isNull=Optional.ofNullable(s[2]);

	if(isNull.isPresent()) {
		
		System.out.println(s[2].length());
				
	}
	else {
		System.out.println("value not there");
	}
	
	isNull.ifPresent(e-> System.out.println(e));
	
	Optional<String> nothing=Optional.empty();
	
	nothing.ifPresent(e->System.out.println(e));
	
	// JDK 10 no need to mention the datatype the keyword var is enough
	var x= 10;
	System.out.println(x+100);
	
	// new switch case in JDK 12
	
	var n = 3;
	var m= switch(n){
	case 1 -> "one";
	case 2 -> "two";
	case 3 -> "three";
	default -> "not found";
	};
	
	
	
	
	
	System.out.println(m+n);
}
}


