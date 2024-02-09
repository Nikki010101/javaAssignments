package streams;

import com.google.gson.internal.bind.util.ISO8601Utils;
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
        };
            System.out.println(a.getWords(list1));   //-----6
        int[] i1={2,32,79,90,117,54,61,88,10,44,97,62};
        IntStream v1= Arrays.stream(i1);
        v1.filter(s2 -> s2%2==1).map(s3 -> (s3*2)).forEach(s4 -> System.out.print(s4+" "));  //----7
        System.out.println();
        int[] i2={2,-3,0,-90,117,54,-61,-88,10,-44,97,-62};
        IntStream v2= Arrays.stream(i2);
        System.out.println(v2.filter(s2 -> s2>0).map(s3 -> (s3*s3)).sum());  //----8
        List<String> list2=new ArrayList<>(List.of("hello","apple","Aeroplane","tiger","animal"));
        Stream<String> sortstr=list2.stream();
        Optional<String> d= (sortstr.max(String::compareTo));
        String d1= d.get();
        System.out.println("Max element: "+ (d1));   //----9
        List<Integer> listInt=new ArrayList<>();
           listInt.addAll(List.of(1,1,2,5,4,7,2,3,6,6,7,9));
           Stream<Integer> removeDuplicates=  listInt.stream();
           removeDuplicates.distinct().forEach(System.out::print); //----10
        System.out.println();
        List<String> list3=new ArrayList<>(List.of("hello","apple","Aeroplane","tiger","animal","tomato")); //----11
        Stream<String> grouping=list3.stream();
        System.out.println(grouping.collect(Collectors.groupingBy(String::length)));
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

