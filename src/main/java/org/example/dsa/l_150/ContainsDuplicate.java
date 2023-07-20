package org.example.dsa.l_150;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
    int[] a = {1,1,1,3,3,4,3,2,4,2};
        int[] b = {1,3,4,2};
        System.out.println( containsDuplicate_mySolution(a));
        System.out.println( containsDuplicate_idealSolution(a));
        System.out.println( containsDuplicate_idealSolution(b));

    }

    private static boolean containsDuplicate_idealSolution(int[] a) {
        // could be converted tolist  and then into set. then just check length of set and originaal array
        Set<Integer> s = new HashSet<>();
        for (int x:a) {
           if ( !s.add(x)){
               return true;
           }

        }
        return false;
    }

    public static boolean containsDuplicate_mySolution(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer orDefault = map.getOrDefault(num, 0);
            map.put(num, orDefault + 1);
        }
        return map.values().stream().anyMatch(v->v>1);
    }
}
