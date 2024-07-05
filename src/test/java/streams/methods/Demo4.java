package streams.methods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        //toArray()
        List<String> stringList = Arrays.asList("A","s","d", "1","2","4","d");
        Object arr[] = stringList.stream().toArray();
        for(Object ar : arr){
            System.out.println(ar);
        }
    }
}
