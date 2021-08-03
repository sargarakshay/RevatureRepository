import java.util.Scanner;

public class PresenterLayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BusinessLayer aadharChecker = new BusinessLayer();
		
		System.out.print("Enter the Aadhar Number to Validate : ");
		
		try {
			aadharChecker.isValidAadharCard(sc.nextLine());
		} catch (InvalidAadharException e) {
			System.out.println(e.getMessage());
		} catch(InvalidAadharLengthException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessfull!!!");
		}
		
		System.out.println();
		
		BusinessLayer passwordChecker = new BusinessLayer();
		
		System.out.print("Enter the password to validate : ");
		
		try {
			passwordChecker.isValidPassword(sc.nextLine());
		} catch (InvalidPasswordException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessfull!!!");
		}
		
		sc.close();
	}
}
