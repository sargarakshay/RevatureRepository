public class NumberOfSquare {
    public static void main(String[] args) {
        int input1 = 1;
        int input2 = 5;
        int input3 = 9;
        int input4 = 3;
        int input5 = 25;
        double[] sqrt = new double[5];

        int[] arr = {input1, input2, input3,input4, input5};
        int count = 0;
        for(int i = 0; i< arr.length; i++) {
            sqrt[i] = Math.sqrt(arr[i]);
        }

        for (int i = 0; i < sqrt.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (sqrt[i] == arr[j] && i!=j) {
                    count++;
                }
            }
        }

        if (count==0) {
            System.out.println("NONE");;
        } else if (count == 1) {
            System.out.println("ONE");
        } else {
            System.out.println("MANY");
        }
    }
}
