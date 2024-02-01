package org.example;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i= Integer.parseInt(sc.next());
        isPalindrome(i);
    }
    public static boolean isPalindrome(int i){
        int temp=i;
        int reverse = 0;
        while(temp!=0){
            reverse=(reverse*10)+temp%10;
            temp=temp/10;
        }
        if(reverse==i){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        return reverse==i;
    }
}
