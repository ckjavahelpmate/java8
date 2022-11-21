package LambdaExpression;
@FunctionalInterface
interface P3 {

	void m1(int a ) ;
	default void m2( int a ) {
		System.out.println("From P3 default");
	}
}
class Demo implements P3{
	@Override
	public void m1( int n) {
		System.out.println( " From demo class");
	}
	 
}
public class P2 {
	public static void main(String[] args) {
//		method overriding
		P3 d = new Demo() ;
		d.m1( 4 );
//		using lambda Expression
		P3 dl = ( n ) -> System.out.println("From lambda");
		dl.m1( 4 );
	}
}