package com.company;

public class PositionOfAnElementInInfiniteSortedArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int target = 4;
        System.out.println(finalAns(arr, target));
    }
    static int finalAns(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp_start = end + 1;
            end = (end - start + 1) * 2;
            start = temp_start;
        }
        return bs(arr, target, start, end);
    }
    static int bs(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
