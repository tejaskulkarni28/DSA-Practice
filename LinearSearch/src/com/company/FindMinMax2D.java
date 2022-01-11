package com.company;

public class FindMinMax2D {
    public static void main(String[] args){

        int[][] arr = new int[][] {
                {101,102},{354,789,900},{12,1200}
        };
        int gotMinNumber = getMinNumber(arr);
        int gotMaxNumber = getMaxNumber(arr);

        System.out.println("This is the smallest number in 2D array: " + gotMinNumber);
        System.out.println("This is the greatest number in 2D array: " + gotMaxNumber);

    }
    static int getMinNumber(int[][] arr){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }

        return min;
    }

    static int getMaxNumber(int[][] arr){
        int max =Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        return max;
    }
}
