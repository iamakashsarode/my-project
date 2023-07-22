package org.example.dsa.l_150.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {3,2,4}, target = 6;
        for (int a:twoSum_MySolution(nums,target)
             ) {
            System.out.println("index = " + a);
        }
    }
    public static int[] twoSum_MySolution(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i );
        }
        return new int[]{};
    }

    public static int[] twoSum_IdealSolution(int[] nums, int target) {
        //saem solution
        return new int[]{};
    }
}
