package Arrays;

import java.util.Scanner;

public class Largest_Smallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++) {
            System.out.print("Enter number at index "+ i+": ");
            num[i]=(sc.nextInt());
        }int smallest=num[0];int largest=num[0];
        for(int j=0;j< num.length-1;j++){

            if(num[j]<smallest){
                smallest=num[j];

            }
            if(num[j]>largest){
                largest=num[j];

            }
        }
        System.out.println("Smallest:"+smallest+" Largest:"+ largest);
    }
}
