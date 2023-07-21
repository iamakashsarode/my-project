package org.example.dsa.l_150;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println("is anagram = " + isAnagram_MySolution("ratt","tart"));
        System.out.println("is anagram = " + isAnagram_IdealSolution("ratt","tart"));
    }

    public static boolean isAnagram_MySolution(String s, String t) {
        Map<Character,Integer> map= new HashMap<>();
        for (Character c:s.toCharArray()
             ) {
            Integer orDefault = map.getOrDefault(c, 0);
            map.put(c,orDefault+1);
        }

        for (Character c:t.toCharArray()
        ) {
            Integer orDefault = map.getOrDefault(c, 0);
            map.put(c,orDefault-1);
        }

        return map.values().stream().noneMatch(v->v>0);
    }
    public static boolean isAnagram_IdealSolution(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }

}
