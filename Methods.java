package jmethods;

public class Methods {
	
	public static String MyMethods(String name) {
		
		return "Hello "+name;
	}
	
	public static void main(String[] args) {
		String valuefrommethods = MyMethods("World");
		System.out.println(valuefrommethods);
	}

}
