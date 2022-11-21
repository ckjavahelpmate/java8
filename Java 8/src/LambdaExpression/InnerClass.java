package LambdaExpression;

import java.util.function.IntPredicate;

class Demo1{
	public  class A {
		 static  int a = 10 ;
		 void m1() {
			 System.out.println("From A class");
		 }
	}
	
}
public class InnerClass extends Demo1 {
	void m1() {
		System.out.println("From inner class ");
	}
	public static void main(String[] args) {
		
		IntPredicate p = n-> n%2==0 ;
		System.out.println( p.test(245));
		
	}

}
