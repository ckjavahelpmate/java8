package LambdaExpression;

import java.util.Arrays;

interface ArrayMultiplication {
	void m(int[] a, int n ) ;
}
public class TestArrayMultiplicatin {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 } ;
		 
		ArrayMultiplication am = ( b , n)-> {
			for (int i = 0; i < b.length; i++) {
				b[i] = b[i]*n ;
			}
		} ;
		 am.m(a, 10); 
		 am.m(a, 10); 
		System.out.println(Arrays.toString(a));
		
		Thread t1 = new Thread(()->System.out.println(Thread.currentThread().getName()));
		t1.setName("Sheela");
		t1.start();
	
	
	
	}
}
