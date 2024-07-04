package streams.filters;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {
    public static void main(String[] args) {
        //length of the name should be < 6 nad > 8
        List<String> names = Arrays.asList("kohilin", "kanchana","minamina", "rinkie","simbhahjhjfhdhf");
        names.stream().filter(name-> name.length()>6 && name.length()<8).forEach(name-> System.out.println(name));
        /*List<String> longNames = new ArrayList<>();
        longNames= names.stream().filter(name-> name.length()>6 && name.length()<8).collect(Collectors.toList());*/
    }
}
