package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 20, 2, 3, 5, 6, 8, 9};
        int range_l = 2;
        int range_h = 8;
        int target = 20;
        int gotIndex = getIndex(arr, range_l, range_h, target);
        System.out.println(gotIndex);
    }
    static int getIndex(int[] arr, int range_l, int range_h, int target){
        for(int i=range_l; i<range_h; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
