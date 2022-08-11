package javaencapsulation;

public class Encapsul {
	
	private String user_name;
	private String password;
	
	
	public String getuser_name() {
		return user_name;
	}
	
	public String setuser_name(String newuser_name) {
		user_name = newuser_name;
		return user_name;
	}
	
	public String getpassword() {
		return password;
	}
	
	public String setpassword(String newpassword) {
		if(newpassword.length() > 9) {
			System.out.println("Please enter password less than 9 characters ");
		}
		else {
			
			password = newpassword;
		}
		
		return password;
		
	}

}
