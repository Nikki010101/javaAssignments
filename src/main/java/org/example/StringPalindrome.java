package org.example;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        String s = (sc.next());
        checkStringPalindrome(s);
    }
    public static boolean checkStringPalindrome(String str){
        String n="";
        for(int j=str.length()-1;j>=0;j--){
            n+=str.charAt(j)+"";
        }
        if(str.toLowerCase().equals(n.toLowerCase())){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }return str.toLowerCase().equals(n.toLowerCase());
    }
}
