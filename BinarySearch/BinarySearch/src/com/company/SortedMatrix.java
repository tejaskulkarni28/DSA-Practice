package com.company;

public class SortedMatrix {
    public static void main(String[] args){

    }
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                colStart = mid + 1;
            }
            else{
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] searchTarget(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int midCol = cols / 2;

        // run the loop till 2 rows are remaining
        while(rowStart < rowEnd-1){
            int mid = rowStart +(rowEnd - rowStart) / 2;

            if(matrix[mid][midCol] == target){
                return new int[]{mid, midCol};
            }
            if(matrix[mid][midCol] < target){
                rowStart = mid;
            }
            else{
                rowEnd = mid;
            }

            // now we have 2 rows
            // check whether the target is in the col of 2 rows
            if(matrix[rowStart][midCol] == target){
                return new int[]{rowStart + 1, midCol};
            }

            // other-wise search in 1st half
        }
        return new int[]{-1};
    }
}
