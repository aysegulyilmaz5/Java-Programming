package switchcase;

import java.util.*;

public class days {
	public static void main(String[] args) {
		
		System.out.print("Please enter a day:");
		Scanner scan = new Scanner(System.in);
		String day = scan.next();
		
		switch(day) {
		case "Monday":
			System.out.println("First day of week");
			break;
		case "Tuesday":
			System.out.println("Second day of week");
			break;
		case "Thursday":
			System.out.println("Third day of week");
			break;
		case "Wednesday":
			System.out.println("Fourth day of week");
			break;
		case "Friday":
			System.out.println("Fifth day of week");
			break;
		case "Saturday":
			System.out.println("Sixth day of week");
			break;
		case "Sunday":
			System.out.println("Seventh day of week");
			
		default:
			System.out.println("Please enter a valid string");
		}
	}
}
