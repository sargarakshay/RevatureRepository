package com.app.springstudent.model.problemsolving;

public class greedyAlgorithm {
    public static void main(String[] args) {
        String str1 = "FISH";
        String str2 = "FOSH";

        int[][] arr = new int[str1.length()][str2.length()];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    arr[i][j] = count++;
                }
                arr[i][j] = count;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("\nString Matched : " + count);
    }
}
