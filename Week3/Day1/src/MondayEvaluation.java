import java.util.Scanner;

public class MondayEvaluation {
    public static void main(String[] args) {

        /*
        String str= "ABCyz";
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            int asci = Math.abs (96 - str.charAt(i));
            if(asci < 10) {
                sb.append("0").append(asci);
            } else {
                sb.append(asci);
            }
        }
        System.out.println(sb.toString());
        */

        int k1;
        int k2;
        int tr;
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            k1 = sc.nextInt();
            k2 = sc.nextInt();
            tr = sc.nextInt();

            int dist1 = Math.abs(k1 - tr);
            int dist2 = Math.abs(k2- tr);

            if(dist1 < dist2) {
                System.out.println("Kid 1");
            } else if(dist2 < dist1) {
                System.out.println("Kid 2");
            } else {
                System.out.println("Truck");
            }

        }
    }
}
