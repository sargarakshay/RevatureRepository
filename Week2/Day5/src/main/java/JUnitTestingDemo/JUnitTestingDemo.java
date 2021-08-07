package JUnitTestingDemo;

public class JUnitTestingDemo {
    public static void main(String[] args) throws InvalidStringException {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int n = 3;
        String str = "Revature";

        System.out.println("Max element in Array : " +maxElementInArray(arr));
        System.out.println("Cube : " +cubeOfElement(n));
        System.out.println("Reversed string : " +reverseString(str));
    }

    public static int maxElementInArray(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int cubeOfElement(int n) throws IllegalArgumentException{
        if (n <= 0) {
            throw new IllegalArgumentException("Negative number is not allowed");
        }
        return n*n*n;
    }

    public static String reverseString(String str) throws InvalidStringException{
        if (str.length() <= 0) {
            throw new InvalidStringException("String must contains at least 2 characters");
        }
        return new StringBuffer(str).reverse().toString();
    }
}
