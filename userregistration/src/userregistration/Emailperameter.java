package userregistration;

public class Emailperameter {
	
	public boolean validEmail(String email) {
		String emailPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@[0-9A-Za-z]+.[a-zA-Z]{2,4}([.][A-Za-z]{2,3})*$";
		boolean result = email.matches(emailPattern) ;
		return result;
	}

}
