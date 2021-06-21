package outputusersnumbers;

import java.util.*;

public class User {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    int i = 0;
	    int sum = 0;
		
		while (i <= 10) {
			
			System.out.println("Please enter the numbers:");
		    i = input.nextInt();
			System.out.println("Entered numbers:" + i);
			sum = sum + i;
			i++;
			
			
		}
		System.out.println("The sum is:" +sum);	
	
	}

}
