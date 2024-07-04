package weekonesequences.javacode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        String input = "I am the best person and I am kind";
        findDuplicate(input);
    }

    private static void findDuplicate(String input) {
        char[] inputChar = input.toCharArray();
        HashMap<Character,Integer>  map = new HashMap<Character, Integer>();
        for (char c:inputChar) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }
        }
        Set<Map.Entry<Character,Integer>> set = map.entrySet();
        for(Map.Entry<Character,Integer> entry: set){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" "+ entry.getValue());}
        }
    }
}
