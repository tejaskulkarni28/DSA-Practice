package com.company;

public class CountCharInStrings {
    public static void main(String[] args){
        String name = "TejasKulkarnii";
        char ch = 'k';
        int gotCount = getCount(name, ch);
        System.out.println(gotCount);
    }
    static int getCount(String name, char ch){
        int count = 0;
        for(int i=0; i<name.length(); i++){
            if(ch == name.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
