package org.example;

import java.util.Scanner;

public class Repeatedchars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter:");
        String s= (sc.next());
        repeatedcharfunc(s);
    }
    public static String repeatedcharfunc(String s){
        char[] x=s.toCharArray();
        String y="";
        for(int i=0;i<=x.length-1;i++){
            if(i!=s.lastIndexOf(x[i])){
                System.out.print(x[i]+"");
                y+=x[i];
            }}

        return y;
    }
}
