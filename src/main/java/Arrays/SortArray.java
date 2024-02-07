package Arrays;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++) {
            System.out.print("Enter number at index " + i + ": ");
            num[i] = (sc.nextInt());
        }
        int[ ] array=(sort(num));
        for(int i=0;i<5;i++) {
            System.out.print( array[i]+" ");
        }
    }
    public static int[] sort(int[] n){
        for(int i=0;i<n.length;i++){

        for(int j=i+1;j<n.length;j++){
            int temp=n[i];
            if(n[i]>n[j]){
                n[i]=n[j];
                n[j]=temp;
            }
        }}
        return n;

    }
}
