
public class RegexProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "J@uliaZ007";
		if(str.length() >= 8 && str.length() <= 30) {
			if(str.matches("([A-Z]*[a-z]*.[0-9]*)")) {
				//
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}

}
