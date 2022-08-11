package mathlibrary;

import java.util.*;

public class MathLibrary {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first integer:");
		
		int x = scan.nextInt();
		
		System.out.println("You are entered:" +x);
		
		System.out.println("Please enter the second integer:");
		
		int y = scan.nextInt();
		
		System.out.println("You are entered:" +y);
		
		System.out.println("Max:" +Math.max(x, y));
		
		System.out.println("Min:" +Math.min(x, y));
		
		System.out.println("Abs x:"+Math.abs(x));
		
		System.out.println("Abs y:"+Math.abs(y));
		
		System.out.println("Sqrt x:"+Math.sqrt(y));
		
		System.out.println("Sqrt y:"+Math.sqrt(x));
		
		
		
		
		
		
		
		
		
	}
	

	
}
