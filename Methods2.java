package jmethods;

public class Methods2 {
	
	public static String Sum(int num1,int num2,String name) {
		
		int sum = num1 +num2;
		
		return "Result =  "+sum+" "+name;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Sum(5,10,"Aysegul"));
	}
}
