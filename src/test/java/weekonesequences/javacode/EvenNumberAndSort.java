package weekonesequences.javacode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenNumberAndSort {
    public static void main(String[] args) {
        int input[] = {1, 4,5,6,8,9,3,2,10};
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0 ; i<input.length;i++){
            list.add(i);
        }
        list = findEvenNumbers(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static List<Integer> findEvenNumbers(List<Integer> list) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int numer:list) {
            if(numer%2==0){
                list1.add(numer);
            }
        }
        return list1;
    }
}
