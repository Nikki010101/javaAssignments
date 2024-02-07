package Loops6;

import java.util.Scanner;

public class LoopsConditions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.println( reverseDigits(sc.nextInt()));
    }
    public static int reverseDigits(int n){
        String str= String.valueOf(n);
        char[] c=str.toCharArray();
        String str2="";
        for(int i=c.length-1;i>=0;i--){
            str2+=(String.valueOf(c[i]))+"";
        }
        return Integer.parseInt(str2);
    }
}
