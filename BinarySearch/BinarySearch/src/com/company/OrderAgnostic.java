package com.company;

public class OrderAgnostic {
    public static void main(String[] args){

        // Ascending order
        // int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        // Descending order
        int[] arr = new int[] {9,8,7,6,5,4,3,2,1};

        int target = 9;

        System.out.println("Index of the following target is: " + getTargetIndex(arr, target));
    }
    static int getTargetIndex(int[] arr, int target){

        int low = 0;
        int high = arr.length-1;

        boolean ans = arr[low] < arr[high];

        while(low <= high){

            int mid = low + (high - low)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(ans){
                // if Ascending
                if(target < arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                // if Descending
                if(target > arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}
