package streams.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
    public static void main(String[] args) {
        //sorted()-->numbers
        List<Integer> list = Arrays.asList(2,4,6,7,89,23,67);
        List<Integer> sortedlist= list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist);

        //sorted() -->reverse order
        List<Integer> reverseList= list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseList);

        //sorted()---> string
        List<String> stringList = Arrays.asList("mahi","nimbe", "kulla", "keeth", "anana", "dave", "Anand");
        List<String> sortedStringList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStringList);

        List<String> reverseSortedStringList = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSortedStringList);
    }
}
