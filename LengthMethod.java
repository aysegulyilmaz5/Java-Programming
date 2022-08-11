package lengthmethod;

import java.util.*;

public class LengthMethod {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first city:");
		
		String city1 = scan.nextLine();
		
		System.out.println("You are entered is:" +city1);
		
		System.out.println("Please enter the second city:");
		
		String city2 = scan.nextLine();
		
		System.out.println("You are entered is:" +city2);
		
		System.out.println("City1 length:"+city1.length());
		System.out.println("City2 length:" +city2.length());
		
		System.out.println("City1 length less than City2 length: " + (city1.length() < city2.length()));
		System.out.println("City1 length greater than City2 length: "+(city1.length() > city2.length()));
		System.out.println("City1 length is equal to City2 length: "+(city1.length() == city2.length()));
		
		
		
	}

}
