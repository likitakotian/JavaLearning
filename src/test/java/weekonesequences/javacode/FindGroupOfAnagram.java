package weekonesequences.javacode;

import java.util.*;

public class FindGroupOfAnagram {
    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strings));
    }

    private static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>>list=new ArrayList<>();
        Map<String,List<String>>map=new LinkedHashMap<>();

        for(String words: strings){
            char[] ch = words.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            if(!map.containsKey(str)){
                map.put(str, new ArrayList<String>());
            }
            map.get(str).add(words);
        }
        System.out.println(map);
        list.addAll(map.values());
        return list;
    }

}
