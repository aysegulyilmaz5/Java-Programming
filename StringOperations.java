package stringoperations;

import java.util.*;

public class StringOperations {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the word:");
		
		String word = scan.nextLine();
		
		System.out.println("You are entered:" +word);
		
		System.out.println("Word length is:"+word.length());
		
		System.out.println("Uppercase Word:" +word.toUpperCase());
		
		System.out.println("Lowercase Word:"+word.toLowerCase());
		
		String sentence = "I am write to code in Java";
		
		System.out.println(sentence.indexOf("write"));
		
		String text = "I am using \"Eclipse \" program";
		
		System.out.println(text);
		
	}

}
