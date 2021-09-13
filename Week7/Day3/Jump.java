import java.util.*;

public class Jump {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,1,4};
        int[] arr2 = {3,2,1,0,4};

        Jump jump = new Jump();
        System.out.println(Arrays.toString(arr1));
        System.out.println(jump.jumpMethod(arr1, 0));

        System.out.println(Arrays.toString(arr2));
        System.out.println(jump.jumpMethod(arr2, 0));
    }

    public boolean jumpMethod(int[] arr, int index) {
        if(arr[index]==0) {
            return false;
        }

        if(arr[index]==arr.length-1) {
            return true;
        }

        boolean flag = false;

        for(int jump = 1; jump <= arr[index]; jump++) {
            if(index + jump < arr.length) {
                flag = flag || jumpMethod(arr, index+jump);
            }
        }

        return flag;
    }
}