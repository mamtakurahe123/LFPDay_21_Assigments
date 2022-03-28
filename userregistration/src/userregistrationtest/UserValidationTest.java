package userregistrationtest;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import org.junit.Assert;
import userregistration.UserValidation;

class UserValidationTest {

		@Test
	public void givenFirstName_whenProper_shoildReturnTrue() {	
	UserRegistration user = new UserRegistration();
	boolean result =user.validateFirstName("Nikita");
	Assert.assertEquals(true,result);
	}
	@Test
	public void givenLastName_whenProper_shoildReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean result=user.validateLastName("Mamta");
		Assert.assertEquals(true,result);	
	}
	@Test
	public void givenEmail_whenProper_shoildReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean result=user.validateEmail("mamtaKurahe@gmail.com");
		Assert.assertEquals(true,result);	
	}
	@Test
	public void givenPhoneNo_whenProper_shoildReturnTrue() {
		UserRegistration user=new UserRegistration();
		boolean result=user.validatePhoneNumber("9329605691");
		Assert.assertEquals(true,result);
	}
	@Test
	public void givenPassword_whenProper_shoildReturnTrue() {
		UserRegistration user=new UserRegistration();
		boolean result=user.validatePassword("Mamta@153");
		Assert.assertEquals(true,result);


	}
		
}
