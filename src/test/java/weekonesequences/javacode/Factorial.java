package weekonesequences.javacode;

public class Factorial {
    public static void main(String[] args) {
        int input = 4;
        findFact(input);
    }

    private static void findFact(int input) {
        int fact = 1;
        for(int i=1;i<=input;i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
