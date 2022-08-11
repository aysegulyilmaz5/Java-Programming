package javaencapsulation;
import java.util.*;
public class Encapsulation {
	public static void main(String[]  args) {
		Encapsul u1 = new Encapsul();
		Encapsul u2 = new Encapsul();
		Encapsul u3 = new Encapsul();
		u1.setuser_name("MARTHA");
		u1.setpassword("12345678910");
		System.out.println(u1.getuser_name());
		System.out.println(u1.getpassword());
		System.out.println("------------");
		u2.setuser_name("MOLLY");
		u2.setpassword("12345");
		System.out.println(u2.getuser_name());
		System.out.println(u2.getpassword());
		System.out.println("------------");
		u3.setuser_name("MARRY");
		u3.setpassword("657");
		System.out.println(u3.getuser_name());
		System.out.println(u3.getpassword());
	}
}
