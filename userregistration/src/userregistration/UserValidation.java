package userregistration;

public class UserValidation {
	private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
	private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	private static final String PHONE_NUMBER = "^[0-9]{10}";
	private static final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
	static boolean isFirstNameValid, isLastNameValid, isMailValid, isNumberValid, isPasswordValid;


	public boolean firstName(String firstName) {
		String pattern= "^[A-Z][a-z]{2,}$";
		boolean result =firstName.matches(pattern);
		return result;
	}

	public boolean lastName(String lastName) {
		String pattern= "^[A-Z][a-z]{2,}$";
		boolean result =lastName.matches(pattern);
		return result;
	}

	public boolean eMail(String mail) {
		String pattern = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";;
		boolean result=mail.matches(pattern);
		return result;
	
	}

	public boolean phoneNumber(String phoneNumber) {
	String pattern ="^[0-9]{10}";
	boolean result=phoneNumber.matches(pattern);
	return result;
	}

	public boolean password(String password) {
		String pattern = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-zA-Z0-9@$!%*#?&]{8,}$";
		boolean result=password.matches(pattern);
		return result;	
	}
}
