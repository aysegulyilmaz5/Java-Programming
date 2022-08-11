package jarraylistt;

import java.util.ArrayList;
import java.util.Collections;


public class Array {
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Mazda");
		cars.add("Ford");
		cars.add("Renault");
		Collections.sort(cars);
		System.out.println(cars);
		System.out.println(cars.get(2));
		System.out.println("Before changing: "+cars.get(4));
		cars.set(4, "Opel");
		System.out.println("After changing: "+cars.get(4));
		System.out.println("Size of array: "+cars.size());
		System.out.println("Before delete: "+cars);
		cars.remove(3);
		System.out.println("After delete: "+cars);
		cars.clear();
		System.out.println(""+cars);
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(12);
		numbers.add(34);
		numbers.add(72);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		
	}

}
