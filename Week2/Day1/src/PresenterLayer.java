import java.nio.file.InvalidPathException;

public class PresenterLayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessLayer bl = new BusinessLayer();
		
		try {
			bl.isVaidAge(15);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessful!!");
		}
		
		System.out.println();
		
		try {
			bl.isValidPan("ABCE123");
		} catch (InvalidPathException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Error Handling Sucessful!!");
		}
		
	}

}
