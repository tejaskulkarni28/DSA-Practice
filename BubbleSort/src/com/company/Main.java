package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Bubble Sort Algorithm
        int[] nums = new int[]{11,10,1,3,2,4,5,9,7,8};
        bubbleSort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    static void bubbleSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length - i; j++){
                int temp = 0;
                if(nums[j] < nums[j - 1]){
                    // swap
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
    }
}
