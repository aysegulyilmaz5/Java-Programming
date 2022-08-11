package jscanner;
import java.util.*;
public class Java_Scanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your Id: ");
		int Id = scan.nextInt();
		System.out.println("Enter your height: ");
		float height = scan.nextFloat();
		System.out.println("Enter your weight: ");
		double weight = scan.nextDouble();
		System.out.println("Are you female: ");
		boolean	gender = scan.nextBoolean();
		System.out.println(""+name);
		System.out.println(""+Id);
		System.out.println(""+height);
		System.out.println(""+weight);
		System.out.println(""+gender);
	
		
		
	}
}
