package streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        //read all * 3 and store into target collection
        List<Integer> numbers = Arrays.asList(1,4,6,8,5,6);
        List<Integer> target = numbers.stream().map(number -> number*3).collect(Collectors.toList());
        System.out.println(target);

    }
}
