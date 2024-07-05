package streams.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {
    public static void main(String[] args) {
        //reduce()
        List<String> stringList = Arrays.asList("A","s","d", "1","2","4","d");
        Optional<String>reduced = stringList.stream().reduce((n, m)->{
            return  n+m;
        });
        System.out.println(reduced.get());

        Optional<String>reducednoDuplicate  = stringList.stream().distinct().reduce((n, m)->{
            return  n+m;
        });
        System.out.println(reducednoDuplicate.get());
    }
}
