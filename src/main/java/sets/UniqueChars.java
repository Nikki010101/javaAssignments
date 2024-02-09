package sets;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String word= sc.next();
        Set<Character> chars = new LinkedHashSet<>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }
        for(char c:chars){
            System.out.print(c+"");
        }

    }
}
