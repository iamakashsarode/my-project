package org.example.dsa.l_150.twopointer;

import java.util.Arrays;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println("args = " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;

        while (i<=j){
            if (!Character.isLetterOrDigit(s.charAt(i))) i++;
            else if (!Character.isLetterOrDigit(s.charAt(j))) j--;
            else {
                if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j)))
                    return false;

                i++;
                j--;
            }

        }

        return true;
    }

    public static boolean isPalindrome_Shortest(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuffer(actual).reverse().toString();
        return actual.equals(rev);
    }
}
