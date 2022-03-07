package com.company;

public class BinarySearch {
    public static void main(String[] args){
        // Binary Search using Recursion...
        int arr[] = new int[] {1,2,3,4,5,6,7,8};
        int target = 7;
        int gotTarget = bs(arr, 0, arr.length-1, target);
        System.out.println(gotTarget);
    }
    static int bs(int arr[], int s, int e, int t){
        if(s > e){
            return -1; // if s > e then target is not found.
        }
        int m = s + (e - s) / 2;
        if(t == arr[m]){
            return m;
        }
        if(t < arr[m]){
            return bs(arr, s, m-1, t);
        }
        return bs(arr, m+1, e, t);
    }
}
