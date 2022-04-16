package com.company;

public class SplitArrayLargestSum {
    public static void main(String[] args){
        int[] nums = new int[] {7,2,5,10,8};
        int m = 2;

        int ans = splitArray(nums, m);
        System.out.println(ans);
    }
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start =  Math.max(start, nums[i]); // This will contain the maximum element in an array.
            end += nums[i];
        }

        // nums = [7,2,5,10,8], m = 2
        // binary search
        while(start < end){
            int mid = start + (end - start) / 2;

            // here the value 10 could be the minimum of maximum in an array
            // and the end value is the total sum of all the integers in an array
            int count = 0;

            // calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    // say you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }
}
