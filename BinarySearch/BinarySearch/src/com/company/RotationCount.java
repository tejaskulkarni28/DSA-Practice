package com.company;

public class RotationCount {
    public static void main(String[] args){
        int[] nums = new int[] {4,5,6,1,2,3,6,8};
        int pivot = findPivot(nums);
        if(pivot == -1){
            System.out.println("Array is not rotated");
        }
        else{
            int nums_length = nums.length;
            int pivotPlusOne = pivot + 1;
            int ans = nums_length - pivotPlusOne;
            System.out.println(ans);
        }
    }
    // 1. First find Pivot
    // 2. Second find Pivot + 1 index value... and then subtract (nums.length - 1) - Pivot_Index
    // 3. If Pivot not found then the array is not rotated

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return mid; // as a Pivot
            }
            if (nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] < nums[mid]) {
                start = mid + 1;
            }
            if (nums[start] > nums[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
