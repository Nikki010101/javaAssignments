package streams;

import net.bytebuddy.ClassFileVersion;
import org.jsoup.select.Collector;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsAssignment {
    public static void main(String[] args){
        String[] str={"apple","king","bat","ball","cinderella","google"};
        Stream<String> s=Arrays.stream(str);
        s.map(x -> x.toUpperCase().charAt(0)+x.substring(1,x.length())).sorted().forEach(y -> System.out.print(y+" ")); //-----1
        System.out.println();
        Stream<String> n=   Arrays.stream(str);
        n.filter(x -> x.matches(".*[aeiouAEIOU]*.")).collect(Collectors.toMap(y -> y,y -> y.chars().filter(i -> "aeiouAEIOU".indexOf(i)!=-1).count())).forEach((d,c) -> System.out.print(d+": "+c+" "));   //-----2
        System.out.println();
        int[] i={2,3,7,9,11,5,6,8,10};
        IntStream s1= Arrays.stream(i);
        System.out.println(s1.filter(s2 -> s2%2==1).mapToDouble(s3 -> Math.pow(s3,2)).average().getAsDouble());  //-----3
        Stream<String> newString=Arrays.stream(str);
       // newString.collect(Collectors.toMap(n1 -> n1,n1 -> n1.length())).forEach((k,v)->);
        newString.sorted(Comparator.comparingInt( String::length).thenComparing(Comparator.comparingInt( d1 -> ((String)d1).charAt(((String)d1).length()-1)).reversed())).forEach(System.out::println); //-----4
        MathOperation m=(a,b) ->{
           return a+b;
            };
        System.out.println("Addition with lambda: " +m.performAddition(3,4)); //-----5
            List<String> list1=new ArrayList<>(List.of("hello","apple","Aeroplane","tiger","animal"));
            StartsWithA a=(list2) -> {
                List<String> list3=new ArrayList<>();
                for(int k=0;k<list2.size();k++){
                    if(list2.get(k).toLowerCase().charAt(0)=='a'){
                        list3.add(list2.get(k));
                    }
                }return list3;
        };System.out.println(a.getWords(list1));   //-----6



        }
    }
@FunctionalInterface
interface MathOperation{
    int performAddition(int a,int b);
}
@FunctionalInterface
interface StartsWithA{
    List<String> getWords(List<String> c);
}

