package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args){
        int[] arr = new int[]{4,2,3,4,6,8,6,5,20,4};
        int gotMinNumber = getMinNumber(arr);
        int gotMaxNumber = getMaxNumber(arr);

        System.out.println("This is the smallest number in an array: " + gotMinNumber);
        System.out.println("This is the greatest number in an array: " + gotMaxNumber);
    }
    static int getMinNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min; //if not found
    }
    static int getMaxNumber(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
