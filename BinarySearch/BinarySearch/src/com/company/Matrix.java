
package com.company;

public class Matrix {
    public static void main(String[] args){
        int[][] matrix = new int[][]{{1,3,4,5},{6,7,8,9}};
        int target = 1;
        Boolean bool = search2DMatrix(matrix, target);
        System.out.println(bool);
    }
    static boolean search2DMatrix(int[][]matrix, int target){
        int row = 0;
        int col = matrix[0].length - 1; // for index purpose
        int low = 0;
        int high = matrix[0].length - 1;

        // if there is only one row
        if(matrix.length == 1){
            while(low <= high){
                int mid = low + (high - low) / 2;
                if(target == matrix[0][mid]){
                    return true;
                }
                if(target > matrix[row][mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }

            }
        }

        // if more than one row
        if(matrix.length > 1){
            while(row<matrix.length && col >=0){
                if(target == matrix[row][col]){
                    return true;
                }
                if(target > matrix[row][col]){
                    row++;
                }
                else{
                    col--;
                }
            }
        }
        return false;
    }
}
