import java.util.*;

public class DomainNameExatracter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Url : ");
		String str = scan.nextLine();
		domainExtracter(str);
		scan.close();
	}		
	public static void domainExtracter(String str) {
		String str2[] = str.split("/");
		System.out.println("Domain Name : " +str2[2]);
	}	
}
