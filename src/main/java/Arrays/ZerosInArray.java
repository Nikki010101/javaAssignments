package Arrays;

import java.util.Scanner;

public class ZerosInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++) {
            System.out.print("Enter number at index " + i + ": ");
            num[i] = (sc.nextInt());
        }

        int[ ] array=(findZeros(num));
        for(int i=0;i<5;i++) {
            System.out.print( array[i]+" ");
        }
    }
    public static int[] findZeros(int[] n){
        int[] ar=new int[n.length];
        int j=0;
        for(int i:n) {
            if(i!=0){
                ar[j]=i;
                j++;
            }
            }

        return ar;

    }
}
