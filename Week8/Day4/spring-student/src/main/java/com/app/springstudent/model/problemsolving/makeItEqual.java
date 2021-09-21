package com.app.springstudent.model.problemsolving;

import java.util.Arrays;

public class makeItEqual {
    public static void main(String[] args) {
        String A = "stehath%stj";
        String B = "sgdzgngnzn";
        int index = A.indexOf('%');

        String part1 = A.substring(0, index);
        String part2 = A.substring(index + 1);
        String res = "";
        if (B.startsWith(part1) && B.endsWith(part2)) {
            res = B.substring(part1.length(), B.length() - part2.length());
            System.out.println(res);
        } else {
            System.out.println("-1");
        }


    }
}
