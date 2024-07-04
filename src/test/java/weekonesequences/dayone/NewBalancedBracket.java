package weekonesequences.dayone;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NewBalancedBracket {
    public static void main(String[] args) {
        String input = "{{}[]()";
        if(isBalance(input)){
            System.out.println("yess");
        } else {
            System.out.println("nope");
        }
    }

    private static boolean isBalance(String input) {
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){
            if(map.containsValue(ch)){
                stack.push(ch);
            } else if(map.containsKey(ch)){
                if(stack.isEmpty() || stack.pop() != map.get(ch)){
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }

}
