package streams.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo8 {
    public static void main(String[] args) {
        //concatenation
        List<String> animal = Arrays.asList("Lion", "Tiger", "Cat", "Mouse", "Frog","Monkey");
        List<String> bird = Arrays.asList("Crow", "Parrot", "Mina", "Chika", "Ostrich","Gubbi");

        Stream<String> animalStream = animal.stream();
        Stream<String> birdStream = bird.stream();

       List<String> allList = Stream.concat(animalStream, birdStream).collect(Collectors.toList());
        System.out.println(allList);
        for(String item:allList){
            System.out.println(item);
        }



    }
}
