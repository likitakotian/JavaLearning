package streams.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
    public static void main(String[] args) {
        //remove null values from list and store it in another list
        List<String> inputs = Arrays.asList("cup", null, "car", null, "kind", "happy", "positive", null, "peace");
        List<String> nonNullList = inputs.stream().filter(n->n!=null).collect(Collectors.toList());
        System.out.println(nonNullList);
    }
}
