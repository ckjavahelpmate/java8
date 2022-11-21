package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingLambda {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>() ;
		al.add( 4 ) ;
		al.add( 1 ) ;
		al.add( 2 ) ;
		al.add( 5 ) ;
		al.add( 3 ) ;
		System.out.println( al );
		Collections.sort( al , (o1,o2)-> o1-o2);
		System.out.println( al );
		
		List<Integer> even = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println( even );
	}
 
}
