package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++) {
            System.out.print("Enter number at index " + i + ": ");
            num[i] = (sc.nextInt());
        }int[ ] array=(reverse(num));
        for(int i=0;i<5;i++) {
            System.out.print( array[i]+" ");
        }
    }
    public static int[] reverse(int[] n){
            int[] ar=new int[n.length];
            int c=0;
            for(int i=n.length-1;i>=0;i--){
                ar[c]=n[i];
                c++;
            }
        return ar;

    }
}
