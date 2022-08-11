package comparetwoconditions;

import java.util.*;

public class Compare {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Please enter the first integer:");
	
	int number1 = scan.nextInt();
	
	System.out.println("You are entered: " +number1);
	
	System.out.print("Please enter the second integer:");
	
	int number2 = scan.nextInt();
	
	System.out.println("You are entered:" +number2);
	
	System.out.println(number1 == number2);
	System.out.println(number1 <= number2);
	System.out.println(number1 >= number2);
	System.out.println(number1 != number2);
	System.out.println(number1 < number2);
	System.out.println(number1 > number2);
	
	
	}
	


}
