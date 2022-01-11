package com.company;

public class Rotate_N_By_D_Elements{
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int d = 2;
        rotateByDelements(arr, d);
        print(arr);
    }
    static void rotateByDelements(int arr[], int d){
        for(int i=0; i<d; i++){
            rotate(arr);
        }
    }
    static void rotate(int arr[]){
        int temp = arr[0];
        int n = arr.length;
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
