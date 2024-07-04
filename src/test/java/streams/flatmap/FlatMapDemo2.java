package streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args) {
        List<String> team1 = Arrays.asList("Ganga", "Yamuna", "Sangam");
        List<String> team2 = Arrays.asList("Nee", "Prema", "Kene");
        List<String> team3 = Arrays.asList("Kene", "Haalu", "Jenu");
        List<String> team4 = Arrays.asList("Seridante", "EeBaduku");

        List<List<String>> teams = Arrays.asList(team1, team2, team3, team4);

        //name.length >4 and all in caps
        List<String> finalTeam = teams.stream().flatMap(x->x.stream().filter(name->name.length()>4).map(names->names.toUpperCase())).collect(Collectors.toList());
        System.out.println(finalTeam);
    }
}
