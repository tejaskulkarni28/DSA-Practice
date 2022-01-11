package com.company;

public class FindPeakInMountainArray {
    public static void main(String[] args){
        int[] arr = new int[] {1,3,5,4,2};
        System.out.println("Index of Find Peak In Mountain Array is: " + getPeakIndex(arr));
    }
    static int getPeakIndex(int[] arr){

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while(start < end){
            // Initialization of mid_index
            mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                // then the mid is in ascending order
                // therefore initialize start = mid + 1
                start = mid + 1;
            }
            if(arr[mid] > arr[mid + 1]){
                // then the mid is in descending order
                // therefore initialize end = mid;
                end = mid;
            }
        }

        return end; // temporary base condition
    }
}
