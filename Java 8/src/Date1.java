import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class Date1 {
	public static void main(String[] args) throws ParseException {
//		To read the date from the user
		Scanner sc = new Scanner(System.in ) ;
		System.out.println("Enter the date");
		String strDate = sc.nextLine() ;
		
//		To convert String date into System date format.
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(strDate) ;
		System.out.println(date);
		
//		To print the day name of the given date
		Format f1 = new SimpleDateFormat("EEEE") ;
		String day = f1.format(date) ;
		System.out.println("Day name of date "+strDate+" is: "+day);
		
//		To print the Month name of the given date
		Format f2 = new SimpleDateFormat("MMM") ;
		String month = f2.format(date) ;
		System.out.println("Month name of date "+strDate+" is: "+month) ;

		sc.close() ;
	}

}
