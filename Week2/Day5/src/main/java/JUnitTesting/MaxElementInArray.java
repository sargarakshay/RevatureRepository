package JUnitTesting;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] arr = {10 , 1, 3, 6, 5, 2, 9, 4, 8, 6, 7};
        int n = 10;

        System.out.println("Max element is : " + maxArrayElement(arr));
        System.out.println(cubeOfGivenElement(n));
    }

    public static int maxArrayElement(int[] arr) {
        int max = arr[0];

        for (int i: arr) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int cubeOfGivenElement(int n) {
        if (0 >= n) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        int i = n * n * n;
        return i;
    }
}
