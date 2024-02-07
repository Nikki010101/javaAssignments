package Arrays;

import java.util.Scanner;

public class RotateArray {

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int[] num=new int[5];
            for(int i=0;i<5;i++) {
                System.out.print("Enter number at index " + i + ": ");
                num[i] = (sc.nextInt());
            }System.out.print("Enter n: ");
            int n=(sc.nextInt());
            int[ ] array=(rotate(num,n));
            for(int i=0;i<5;i++) {
                System.out.print( array[i]+" ");
            }
        }
        public static int[] rotate(int[] n,int n1){
            int[] ar=new int[n.length];

           for(int i=0;i<n1;i++){

               ar[i]=n[n.length-1-i];
           }
            for(int i=n1;i<n.length;i++){

                ar[i]=n[i-n1];
            }
            return ar;

        }
}
