package Loops6;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.println( checkingAge(sc.nextInt()));
    }
    public static String checkingAge(int n){
        if(n>0&&n<13){
            return "kid";
        }else if(n>19){
            return "adult";
        }else if(n<=19&&n>=13){
            return "teen";
        }else{return "invalid age";}
    }
}
