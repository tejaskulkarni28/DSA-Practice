package com.company;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args){
        char targetChar = 'a';
        char[] chr = new char[] {'b','d','f','h'};

        System.out.println(getChar(chr, targetChar));
    }


    static char getChar(char[] chr, char target){
        int low = 0;
        int high = chr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(target < chr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return chr[low % chr.length];
    }
}
