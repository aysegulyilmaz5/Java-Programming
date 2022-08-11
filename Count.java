package whilemethod;

import java.util.*;

public class Count {
	public static void main(String[] args) {
		System.out.print("Please enter an integer:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = 0;
		int sum = 0;
		
		while(i> 0 && j <i) {
			
			System.out.println("" +j);
			j++;
			sum = sum +j;
			
		}
		
		System.out.println("The sum is:"+sum);
		
		
	}

}
