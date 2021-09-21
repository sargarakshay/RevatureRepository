package com.app.springstudent.model.problemsolving;

import java.util.*;

public class distinctString {
    public static void main(String[] args) {
        String str = "AGGREGATE";

        StringBuilder sb = new StringBuilder();
        TreeSet<Character> characterTreeSet = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (characterTreeSet.add(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        LinkedHashSet<Character> characterLinkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (characterLinkedHashSet.add(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
        }

        System.out.println("Using TreeSet : " + sb);
        System.out.println("Using LinkedHashSet : " + stringBuilder);
    }
}
