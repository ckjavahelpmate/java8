import java.util.Scanner;

public class DatePrintingWithoutBuiltin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter the date");
		String str = sc.nextLine();
		str = printMonthInWords(str) ;
//		System.out.println(str);
		str = printTimeIn24hrFormat(str) ;
		System.out.println( str );
	}
	public static String printMonthInWords(String str) {
		String[] s = str.split("/") ;
		int month = Integer.parseInt(s[1]) ;
		switch(month) {
		case 1 : s[1] = "Jan" ;break;
		case 2 : s[1] = "Feb" ;break;
		case 3 : s[1] = "March" ;break;
		case 4 : s[1] = "April" ;break;
		case 5 : s[1] = "May" ;break;
		case 6 : s[1] = "June" ;break;
		case 7 : s[1] = "July" ;break;
		case 8 : s[1] = "Agust" ;break;
		case 9 : s[1] = "Sept" ;break;
		case 10 : s[1] = "Octo" ;break;
		case 11 : s[1] = "Nov" ;break;
		case 12 : s[1] = "Dec" ;break;
		default : System.out.println("invalid month...!");
		}
		str = s[1]+" " ;
		for (int i = 0; i < s.length; i++) {
			if( i ==1) {
				continue ;
			}
			else {
				str = str + s[i]+" ";
			}
		}
		return str ;
	}
	public static String printTimeIn24hrFormat(String str) {
		String[] s = str.split("[ :]+") ;
		
		int hr = Integer.parseInt(s[s.length-3]) ;
		String time = s[s.length-1] ;
		if( time.equalsIgnoreCase("pm")) {
			s[s.length-3] = 12+hr+":" ;
			s[s.length-1] = "hrs" ;
		}
		else {
			s[s.length-1] = "hrs" ;
		}
		str = "" ;
		for (int i = 0; i < s.length; i++) {
			if( i ==s.length-3) {
				str = str + s[i];
			}
			else {
				str = str + s[i]+" ";
			}
		}
		return str ;
	}

}
