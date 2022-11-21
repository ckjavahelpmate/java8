
public class Reverse {
	public static void main(String[] args) {

		
	 String str = "Reverse each word in string " ;
	 String[] s = str.split(" ") ;
	 
	 StringBuilder sb = new StringBuilder() ;
	 for(String st : s ) {
		 sb.append(new StringBuilder(st).reverse()+" " );
	 }
	 System.out.println(sb);
	 
	}
}
