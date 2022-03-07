package com.company;

public class SplitArrayLargestSum {
    public static void main(String[] args){

    }
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start =  Math.max(start, nums[i]); // This will contain the maximum element in an array.
            end += nums[i];
        }

        // binary search
        while(start < end){
            int mid = start + (end - start) / 2;
        }
        return end;
    }
}
