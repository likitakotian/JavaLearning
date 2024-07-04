package streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Students{
    int id ;
    String name;
    int marks;
    public Students(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class FlatMapDemo3 {
    public static void main(String[] args) {

        List<Students> section1 = Arrays.asList(
                new Students(1,"Kavya", 122333),
                new Students(2,"Akku", 8989),
                new Students(3,"Anjana", 1223393),
                new Students(4,"Arpita", 78787),
                new Students(5,"Kavita", 76756),
                new Students(6,"Kavya", 9090)

        );
        List<Students> section2 = Arrays.asList(
                new Students(7,"namrata", 122333),
                new Students(8,"nirmala", 8989),
                new Students(9,"prajana", 1223393),
                new Students(10,"priynaka", 78787),
                new Students(11,"megha", 76756),
                new Students(12,"Meghana", 9090)

        );
        List<Students> section3 = Arrays.asList(
                new Students(13,"Meghashree", 122333),
                new Students(14,"Liki", 8989),
                new Students(15,"vijji", 1223393),
                new Students(16,"shreevalli", 78787),
                new Students(17,"smitha", 76756),
                new Students(18,"Devika", 9090)

        );

        List<List<Students>> section0 = Arrays.asList(section1, section2,section3);
        List<Integer> section = section0.stream().flatMap(x->x.stream().filter(n->n.marks>8989).map(m->m.id*100)).collect(Collectors.toList());
        System.out.println(section);
    }
}
