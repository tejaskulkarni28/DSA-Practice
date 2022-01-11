package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] accounts = new int[][]{{1,2,3},{2,2,2}};
        System.out.println(sum(accounts));
    }
    static int sum(int[][] accounts){
        int count = 0;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                count++;
            }
        }
        return count;
    }
}
