package org.example;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter:");
        String s = (sc.nextLine());
        System.out.println( uniqueWordsCount(s));
    }
    public static Map<String,Integer> uniqueWordsCount(String s){
        List<String> str=new ArrayList<>(List.of(s.split(" ")));
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<str.size();i++){
            int c=0;
            for(int j=0;j<str.size();j++){
                if(str.get(i).equals(str.get(j))){
                    c++;
                }
            }h.put(str.get(i),c);
        }
        return h;
    }

}
