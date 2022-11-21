package StreamPackage;

import java.util.Arrays;

public class StreamMethodReference {

	public static void main(String[] args) {
		String[] str = "TODO Auto-generated method stub".split(" ") ;
		System.out.println(Arrays.toString(str));
		Arrays.sort( str, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(str));

	}

}
