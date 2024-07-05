package streams.methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        //distinct--> non-terminal operation
        // count and limit-->terminal operations
        List<String> vehicleList = Arrays.asList("Bus", "car", "bus", "car", "tempo", "bike");

        //terminal operation collect()
        List<String> distinctVehicle = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct vechiles are--->"+ distinctVehicle);

        //terminal operation forEach()
        vehicleList.stream().distinct().forEach(n-> System.out.println(n));

        //terminal operation count
        long count= vehicleList.stream().distinct().count();
        System.out.println("total distinct vehicle--->"+ count);

        //non terminal limit()
        vehicleList.stream().limit(3).forEach(n-> System.out.println(n));

    }
}
