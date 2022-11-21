package LambdaExpression;

import java.util.function.Function;
import java.util.function.Predicate;

public class P1 {

	public static void main(String[] args) {
		System.out.println( sqr(5) );
		Function<Integer,Integer> function = n ->   n*n ;
		System.out.println( function.apply(6));
		
		Predicate<Integer> p = i -> i%2==0 ;
		System.out.println( p.test(5));
	}
	public static int sqr( int n ) {
		return n*n ;
	}
}
