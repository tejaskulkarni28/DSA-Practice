package com.company;

public class NumberExistsOrNot {
    public static void main(String[] args){
        //weather 13 exists or not in an array
        int[] arr = new int[] {1, 4, 6, 8, 10, 13 , 15, 16, 18};
        int target = 13;

        System.out.println("Index of the following target is: " + getTargetIndex(arr, target));
    }
    static int getTargetIndex(int[] arr, int target){

        int low = arr[0];
        int high = arr.length - 1;
        int mid = 0;

        while(low <= high){
            mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
                //base condition
            }
            if(target < arr[mid]){
                //make high to mid
                high = mid;
            }
            else{
                //make low to mid
                low = mid;
            }
        }

        return -1;
    }
}
