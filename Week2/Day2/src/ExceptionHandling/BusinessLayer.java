package ExceptionHandling;

public class BusinessLayer {
	
	public void isValidAadharCard(String adharCard) throws InvalidAadharException, InvalidAadharLengthException{
		//1234567890121
		//
		adharCard = adharCard.replaceAll(" ", "").trim();
		if(adharCard.matches("[0-9]{12}")) {
			System.out.println("Aadhar Number is Valid");
		} else if(adharCard.length()>12) {
			throw new InvalidAadharLengthException("Invalid Aadhar Length");
		} else {
			throw new InvalidAadharException("Invalid Aadhar Number");
		}
	}
	
	public void isValidPassword(String password) throws InvalidPasswordException{
		if (password.matches("[A-Z]{1}[0-9]{1}[!@#$%]{1}[a-zA-Z]{5,28}")) {
			System.out.println(password + " is a valid Password");
		} else {
			throw new InvalidPasswordException(password + " is a Invalid password");
		}
	}
	
	
}
