package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

    public class Main {
        static Map<String,Student> m= new HashMap<>();
        public static void main(String[] args) {
            Scanner st=new Scanner(System.in);
            for(int l=0;l<2;l++) {
                System.out.print("Enter Student details:");
                Student s=new Student(st.next(),st.next(),st.nextDouble());
                m.put(s.getFirstname(), s);
            }System.out.print("Enter Student name:");
            System.out.println(m.get(st.next()).toString());
            HashMap<Character,Integer> map=new HashMap<>();
            String str="test string";
            for(int i=0;i<str.length();i++){
                Character c =str.charAt(i);
                int count=0;
                for(int j=0;j<str.length();j++){
                    if(c.equals(str.charAt(j))){
                        count++;
                    }
                }
                if(!Character.isWhitespace(c)){
                    if(!map.containsKey(c)){
                        map.put(c,count);}
                }
            }
            System.out.println(map);
            HashMap<Integer,Integer> map1=new HashMap<>();
            int[] a1={10,20,30,40,50,60};
            int n1=-1;
            for(int i=0;i<a1.length;i++){
                for(int j=i+1;j<a1.length;j++){
                    if(a1[i]+a1[j]==100){
                        map1.put(n1++,i);
                        map1.put(n1++,j);
                    }
                }
            }
            System.out.println(map1.values());

        }

}
