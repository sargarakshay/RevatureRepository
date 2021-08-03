import java.nio.file.InvalidPathException;

public class BusinessLayer{
	
	public void isVaidAge(int age) throws InvalidAgeException{
		if(age < 18 || age > 35) {
			throw new InvalidAgeException("You're age is not eligible");
		} 
		
		System.out.println("You're age is "+age+" and you're eligible");
	} 
	
	public void isValidPan(String panNumber) throws InvalidPathException{
		if(!panNumber.matches("[A-Z]{1}[a-zA-Z0-9]{6,27}")) {
			throw new InvalidPanNumber("PAN card is invalid");
		} else {
			System.out.println("Pan Card is Valid");
		}
	}
}
