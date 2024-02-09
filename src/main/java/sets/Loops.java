package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Loops {
    public static void main(String[] args) {

        HashSet<String> set1=new HashSet<>();
        set1.addAll(List.of("apple","bat","lemon","apple","cat","kk","mlm","tc","bjb","hvhvh","bhxz"));
        String[] s=set1.toArray(new String[0]);
        for(int i=0;i<set1.size();i++){
            System.out.println(s[i]);
        }
        Iterator<String> i=set1.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        for(String s1:set1){
            System.out.println(s1);
        }
    }
}
