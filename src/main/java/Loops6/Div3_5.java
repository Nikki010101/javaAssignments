package Loops6;

import java.util.Scanner;

public class Div3_5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        System.out.println( checkDivisibility(sc.nextInt()));
    } public static String checkDivisibility(int n){
        if(n%3==0&&n%5==0){
            return "FizzBuzz";

        }else if(n%3==0){
            return "Fizz";
        }else if(n%5==0){
            return "Buzz";
        }else{
            return "not divisible by 3,5";
        }
    }
}
