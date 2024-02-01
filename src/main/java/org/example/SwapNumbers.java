package org.example;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = (sc.nextInt());
        System.out.print("Enter b : ");
        int b = (sc.nextInt());
        swapping(a,b);
    }public static int[] swapping(int a, int b){
       int i=a;
       int j=b;
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("a:"+a+","+"b:"+b);
        int[] ar={a,b};
        return ar;
    }
}
