package streams.methods;

import java.util.HashSet;
import java.util.Set;

public class Demo6 {
    public static void main(String[] args) {
        //anyMatch(), nonMatch(), allMatch()
        Set<String> fruits = new HashSet<>();
        fruits.add("1 apple");
        fruits.add("1 mango");
        fruits.add("1 nimbe");
        fruits.add("1 tinku");
        fruits.add("1 chiku");
        fruits.add("2 chepe");

        boolean isTrue1= fruits.stream().anyMatch(n->{return n.startsWith("1");});
        System.out.println(isTrue1);

        boolean isTrue2= fruits.stream().allMatch(n->{return n.startsWith("1");});
        System.out.println(isTrue2);

        boolean isTrue3= fruits.stream().noneMatch(n->{return n.startsWith("3");});
        System.out.println(isTrue3);

    }
}
