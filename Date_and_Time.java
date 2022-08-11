package jdateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_and_Time {
	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		System.out.println("Today:"+myObj);
		LocalTime myObj2 = LocalTime.now();
		System.out.println("Instant time:"+myObj2);
		LocalDateTime myObj3 = LocalDateTime.now();
		System.out.println("Instant date and Time:"+myObj3);
	}

}
