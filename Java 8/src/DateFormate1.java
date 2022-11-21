import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateFormate1 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now() ;System.out.println("Current date: "+date);
		LocalTime time = LocalTime.now() ;System.out.println("Current time: "+time);
		LocalDateTime datetime = LocalDateTime.now() ;System.out.println("Current date & time: "+datetime);
		
		
		
//		print it in formate
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy  hh:mm:ss");
		
		String fdt = datetime.format(formatter) ;
		System.out.println(fdt);
		
	}

}
