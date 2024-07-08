package streams.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo7 {
    public static void main(String[] args) {
        //findAny()
        //findFirst()

        List<String> list = Arrays.asList("one", "two", "three", "one");
        Optional<String> element = list.stream().findAny();
        System.out.println(element);
        System.out.println(element.get());

        Optional<String> element1 = list.stream().findFirst();
        System.out.println(element1);
        System.out.println(element1.get());


    }
}
