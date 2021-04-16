package com.luxfacta;

public class Palindrome {

    public  boolean isPalindrome(String word){
        String reverse = "";
        for(int i = word.length() -1; i >= 0; i--){
            reverse += word.charAt(i);
        }
        return reverse.equalsIgnoreCase(word);
    }
}
