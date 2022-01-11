package com.company;

public class SearchInStrings {
    public static void main(String[] args){
        String name = "TejasKulkarni";
        char ch = 'k';
        Boolean checkChar = getChar(name, ch);
        System.out.println(checkChar);
    }
    static boolean getChar(String name, char ch){
        for(int i=0; i<name.length(); i++){
            if(ch == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
