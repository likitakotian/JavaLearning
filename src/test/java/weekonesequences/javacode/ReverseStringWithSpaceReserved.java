package weekonesequences.javacode;

public class ReverseStringWithSpaceReserved {
    public static void main(String[] args) {
        String input = "I am very Happy person";
        reverseWithSpace(input);
    }

    private static void reverseWithSpace(String input) {
        String arr[] = input.split(" ");
        String removeSpace = input.replace(" ", "");
        String reverse = reversing(removeSpace);
        int index =0;
        String op= "";

        for(String s:arr){
            op = op + reverse.substring(index , index+s.length())+" ";
            index = index + s.length();
        }
        System.out.println(op);
    }

    private static String reversing(String removeSpace) {
        char ch[] = removeSpace.toCharArray();
        String rev="";
        for(int i = ch.length-1; i>=0;i--){
            rev = rev+ch[i];
        }
        return rev;
    }


}
