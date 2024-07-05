package streams.methods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 21, 23, 32, 34, 43, 45, 54, 56, 64);
        //how many even numbers
        long evenCount = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("total number of even numbers = " + evenCount);

        //min()
        Optional<Integer>minimum = numbers.stream().min((m, n) -> {return m.compareTo(n);});
        System.out.println("minimum value is -->"+minimum.get());

        //max()
        Optional<Integer>maximum = numbers.stream().max((m, n) -> {return m.compareTo(n);});
        System.out.println("maximum value is -->"+maximum.get());
    }
}
