package com.company;

public class TwoSum {
    public static void main(String[] args){
        int target = 6;
        int[] nums = new int[] {3,2,4};
        int[] output = twoSum(nums, target);
        for(int i=0; i<=output.length-1; i++) {
            System.out.println(output[i]);
        }
    }
    static int[] twoSum(int[] nums, int target) {

            for(int i=0; i<nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        return new int[]{-1, -1};
    }
}
