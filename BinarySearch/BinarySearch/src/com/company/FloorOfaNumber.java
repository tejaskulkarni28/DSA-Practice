package com.company;

public class FloorOfaNumber {
    public static void main(String[] args){
        // floor of a number: Greatest number smaller than or equal to the target.
        int[] arr = new int[]{1,3,5,7,9};
        int target = 4;

        System.out.println("Floor in an array is: " + getFloor(arr, target));
    }

    static int getFloor(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                return  mid;
            }
            if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return high;
    }
}
