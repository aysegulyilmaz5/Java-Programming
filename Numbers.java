package trycatch;

public class Numbers {
	public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5,6,7,8,9};
	try {
		numbers[10] =5 ;
		System.out.println("Succesfully");
	}
	catch(Exception e) {
		System.out.println("Something went wrong");
	}
	
	finally {
		System.out.println("Finally");
	}
	}

}
