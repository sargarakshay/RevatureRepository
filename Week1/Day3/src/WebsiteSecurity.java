import java.util.*;

public class WebsiteSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Url : ");
		String str = sc.nextLine();
		isWebsiteSecured(str);
		sc.close();
	}
	
	public static void isWebsiteSecured(String str) {
		if(str.startsWith("https")) {
			System.out.println("Website is secured");
		} else {
			System.out.println("Website is not secured");
		}
	
	}

}
