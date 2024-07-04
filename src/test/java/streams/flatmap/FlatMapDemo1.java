package streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        //add +1 to all list element
        List<Integer> mapList=list1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println("mapList--->"+mapList);
        //flatmap
        List<Integer> list2 = Arrays.asList(1,2);
        List<Integer> list3 = Arrays.asList(3,4,5,6);
        List<Integer> list4 = Arrays.asList(7,8);

        //add above list to 1 collection and *2 to all
        List<List<Integer>> finalList = Arrays.asList(list2,list3,list4);
        System.out.println("finalList--->"+finalList);
        List<Integer> result= finalList.stream().flatMap(n->n.stream().map(x->x*2)).collect(Collectors.toList());
        System.out.println("result--->"+result);

    }
}
