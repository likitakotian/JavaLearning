package streams.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {
        //find length of every element.and push into collection
        List<String> vehicles = Arrays.asList("Bus", "Car", "Cycle","Motor Cycle");
        List<Integer> vehicleLength = vehicles.stream().map(n->n.length()).collect(Collectors.toList());
        System.out.println(vehicleLength);

    }
}
