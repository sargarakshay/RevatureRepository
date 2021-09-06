package com.app.model;

public class RemoveZeros {
    public static java.lang.String removeLeadingZeros(java.lang.String str){
        if (str == null){
            return null;}
        char[] chars = str.toCharArray();
        int index = 0;
        for (; index < str.length();index++)
        {
            if (chars[index] != '0'){
                break;}
        }
        return (index == 0) ? str :str.substring(index);
    }

    public static java.lang.String removeTrailingZeros(java.lang.String str){
        if (str == null){
            return null;}
        char[] chars = str.toCharArray();int length,index ;length = str.length();
        index = length -1;
        for (; index >=0;index--)
        {
            if (chars[index] != '0'){
                break;}
        }
        return (index == length-1) ? str :str.substring(0,index+1);
    }

    public static void main(String[] args) {
        String str = "01101110100";
        str = removeLeadingZeros(str);
        str = removeTrailingZeros(str);

        System.out.println(str);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0') {
              count++;
            }
        }

        System.out.println(count);
    }
}


