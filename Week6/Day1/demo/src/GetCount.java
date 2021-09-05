public class GetCount {
    public static void main(String[] args) {
        int input1 = 3;
        int input2 = 20;
        int input3 = 5;
        int count = 0;
        for(int i = input1; i <= input2; i++) {
            if (i%input3==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
