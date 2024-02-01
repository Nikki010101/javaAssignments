package org.example;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        int n = Integer.parseInt(sc.next());
    }
    public static int calcFactorial(int n){
        int factorial=1;
        int i=1;
        if(n==0){
            factorial=1;
        }else{
        while(i<=n){
            factorial=factorial*i;
            i++;
        }}
        System.out.println(factorial);
        return factorial;
    }
}
