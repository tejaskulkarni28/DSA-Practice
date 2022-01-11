package com.company;

public class LinearSearch {
    public static void main(String[] args){
        // find weather 13 exists or not ?
        int[] arr = new int[] {1,2,13,14,16,8};
        int target = 13;
        int gotIndex = getIndex(arr, target);
        System.out.println(gotIndex);
    }
    static int getIndex(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
