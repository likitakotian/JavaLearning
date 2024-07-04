package streams.maps;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        //convert all vehicle to lowercase
        List<String> vehicles = Arrays.asList("Bus", "Car", "Cycle","Motor Cycle");
        vehicles.stream().map(n->n.toLowerCase()).forEach(n-> System.out.println(n));
    }
}
