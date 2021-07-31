
public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 3, 7, 8, 5};
		findPrimeNumber(arr);
	}

	public static void findPrimeNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < arr[i]; j++) {
				if(arr[i]%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) System.out.println(arr[i]+ " is a Prime Number");
		}
	}
}
