package Arrays;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++) {
            System.out.print("Enter number at index " + i + ": ");
            num[i] = (sc.nextInt());
        }     System.out.print("Enter number to search : ");
                int n=sc.nextInt();
            System.out.print( "Element is at index: "+(sort(num,n)));

    }
    public static String sort(int[] n,int n1) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == n1) {
                return ""+i;
            }
        }return "element not in array";


    }
}
