import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTime {
	public static void main(String[] args) {

		//Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	
		localDate = LocalDate.ofYearDay(2018, 100);
		System.out.println(localDate);
		
		localDate = LocalDate.of(2020, Month.SEPTEMBER, 8);
		System.out.println(localDate);

		//Local Time
		LocalTime localTime = LocalTime.of(14, 25);
		System.out.println(localTime);
		
		localTime = LocalTime.now();
		System.out.println(localTime);
		
		localTime = LocalTime.ofSecondOfDay(2200);
		System.out.println(localTime);
		
		localTime = LocalTime.of(23, 42, 55, 24);
		System.out.println(localTime);
		
		//Local Date Time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		localDateTime = localDateTime.plusDays(2).plusHours(2);
		System.out.println(localDateTime);
		
		LocalDate localDate2 = LocalDate.now();
		System.out.println(localDate2);
		
		LocalTime localTime2 = LocalTime.now();
		System.out.println(localTime2);
		
		LocalDateTime localDateTime2 = LocalDateTime.now();
		System.out.println(localDateTime2);
	}
}
