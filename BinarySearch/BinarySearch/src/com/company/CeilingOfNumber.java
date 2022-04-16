package com.company;

public class CeilingOfNumber {
    public static void main(String[] args){
        int[] arr = new int[]{1,3,5,7,9,11,13,15,17,19,21};
        int target = 6;

        // Ceiling of a number

        // The Smallest element in an array greater or equal to target.


        System.out.println("The Ceiling of a number is: " + getCeilingOfaNumber(arr, target));
    }


    static int getCeilingOfaNumber(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target == arr[mid]){
                return mid;
                // base condition
            }
            if(target < arr[mid]){
                high = mid - 1;
                // check weather target lies on left on side.
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }
}
// PlayGround
// 1,3,5,6,7
// target = 3 then the output should be 5
// target = 2 then the output should be 3
// ..., etc.