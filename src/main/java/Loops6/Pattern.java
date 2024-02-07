package Loops6;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        pattern();
    }
    public static void pattern(){
        for(int i=0;i<5;i++){
            for(int j=0;j<6;j++){
                if(i+j<=3) {
                    System.out.print("+");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
}
