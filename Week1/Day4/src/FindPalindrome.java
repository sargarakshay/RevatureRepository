import java.util.Arrays;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {101, 22, 411, 321};
		findPalindrome(arr);
	}
	
	public static void findPalindrome(int[] arr) {
		System.out.println("Array : " +Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int rev = 0;
			while(x!=0) {
				int digit = x%10;
				rev = rev * 10 + digit;
				x /= 10;
			}
			if(rev==arr[i]) {
				System.out.println(arr[i]+ " is Palindrome");
			}
		}
	}


}
