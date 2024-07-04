package weekonesequences.javacode;

import java.util.ArrayList;
import java.util.List;

public class RemoveAdjacentElement {


    public static void main(String[] args) {
        int[] input = { 1,2,2,3,4,5,5,3 };
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<input.length;i++){
            list.add(input[i]);
        }
        removeAdj(list);
    }

    private static void removeAdj(List<Integer> list) {
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).equals(list.get(i+1))){
                list.remove(i);
                //list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
