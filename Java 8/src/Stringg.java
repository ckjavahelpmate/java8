
public class Stringg {
	public static void main(String[] args) {
		int n = 5 ;
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < n-1-i ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++) {
				
				int k = fact(i)/(fact(i-j)*fact(j) );
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	public static int fact(int n) {
		if(n==0) {
			return 1 ;
		}
		else {
			return n * fact(n-1) ;
		}
	}
}
