package weekonesequences.javacode;

import java.util.Stack;

public class BalencedBracket {
    public static void main(String[] args) {
        String input = "{}[](){";
        if (isBalanced(input)) {
            System.out.println("Balenced");
        }else{
            System.out.println("not");
        }

    }

    private static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '{':
                case '[':
                case '(':
                    stack.push(input.charAt(i));
                    break;
                case '}':
                    if (stack.isEmpty() || !stack.pop().equals('{')) {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || !stack.pop().equals('[')) {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || !stack.pop().equals('(')) {
                        return false;
                    }
            }
        }
        return stack.empty();
    }
}
