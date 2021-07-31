import java.util.Arrays;
import java.util.Scanner;

public class NthMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Elements : ");
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter "+arr.length+" elemets : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array : " +Arrays.toString(arr));
		System.out.print("Enter N to finth Nth max element : ");
		int k = sc.nextInt(); 
		int count = 0;
		sc.close();
		
		Arrays.sort(arr); //Sorted the array

		for(int i = 0; i < k ; i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}
		}
		System.out.print(k+"th Max element is " +arr[k+count-1]);
	}
}
