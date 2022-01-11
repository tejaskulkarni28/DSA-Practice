package com.company;

public class RotatedBinarySearch {
    public static void main(String[] args){
        int[] nums = new int[] {3,4,5,6,1,2};
        System.out.println(findPivot(nums));
    }
    static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]){
                return mid;
            }
            else if(nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            else if(nums[start]  < nums[mid]){
                start = mid;
            }
            else if(nums[start] > nums[mid]){
                end = mid;
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}
