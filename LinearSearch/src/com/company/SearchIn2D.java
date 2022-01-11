package com.company;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int target = 5;
        int[] ans = search2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2DArray(int[][]arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) {
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
