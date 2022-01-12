package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Selection Sort
        int[] nums = new int[]{9,8,10,6};
        SelectionSort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    static void SelectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);

            swap(nums, maxIndex, last);
        }
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static int getMaxIndex(int[] nums, int start, int end){

        int max = start;

        for (int i = 0; i <= end ; i++) {
            if(nums[max] < nums[i]){
                max = i;
            }
        }

        return max;
    }
}
