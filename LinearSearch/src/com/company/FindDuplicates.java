package com.company;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[] {1,-2,-2,2,2,22};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        int j = 1;
        for(int i=0; i<nums.length; i++){
            for(j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false; // if the no duplicates
    }
}
