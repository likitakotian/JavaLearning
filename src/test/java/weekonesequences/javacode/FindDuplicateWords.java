package weekonesequences.javacode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWords {

    public static void main(String[] args) {
        String input = "ulla ulla tuhe badi moti kutti tuhe tuhihe";
        findDuplicateWords(input);
    }

    private static void findDuplicateWords(String input) {
        String[] words = input.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            } else{
                map.put(word, 1);
            }
        }
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> entry: set){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+ entry.getValue());
            }
        }
    }
}
