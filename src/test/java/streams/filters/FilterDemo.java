package streams.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        /*ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(45);
        numbers.add(56);
        numbers.add(77);
        numbers.add(78);*/
        List<Integer> numbers = Arrays.asList(10, 22, 23, 34, 45, 56, 67, 78, 89);
        List<Integer> evenNumbers = new ArrayList<>();
        //without stream
        /*for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                evenNumbers.add(numbers.get(i));
            }
        }*/
        //evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        //System.out.println(evenNumbers);

        numbers.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));

    }

}
