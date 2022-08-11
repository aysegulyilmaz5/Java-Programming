package arithmeticoperations;

import java.util.*;

public class Operations {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the first integer:");
		int num1 = scanner.nextInt();
		System.out.println("Please enter the second integer:");
		int num2 = scanner.nextInt();
		
		System.out.println("Adding two integers:"+(num1+num2));
		System.out.println("Subtracting two integers:"+(num1-num2));
		System.out.println("Dividing two integers:"+(num1/num2));
		System.out.println("Multiplying two integers:"+(num1*num2));
		System.out.println("Moding two integers:"+(num1 % num2));
		
		
		
	}
}
