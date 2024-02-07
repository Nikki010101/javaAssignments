package Loops6;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.print( "0 1 "+checkFibonacci(sc.nextInt()));
    }
    public static String checkFibonacci(int n){
        int a1=0;
        int a2=1;
        int a3;
        String str="";
        for(int i=0;i<n-2;i++){
            int i1 = a1 + a2;
            str+=(i1+" ");
            a1=a2;
            a2=i1;
        }

        return  str;
    }
}
