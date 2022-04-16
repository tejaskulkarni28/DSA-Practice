package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbs = new int[] {9,8,7,6,5,4,3,2,1};
        InsertionSort(numbs);
        for(int i=0; i<numbs.length; i++){
            System.out.println(numbs[i]);
        }
    }
    static void InsertionSort(int[] nums){
        for(int i=0; i<nums.length -1; i++){
            for(int j=i+1; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
