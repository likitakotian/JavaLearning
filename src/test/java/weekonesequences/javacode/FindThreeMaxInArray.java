package weekonesequences.javacode;

public class FindThreeMaxInArray {
    public static void main(String[] args) {
        int numbers[] = {12, 13, 1, 10, 34, 1};
        findMax(numbers);

    }

    private static void findMax(int[] numbers) {
        int max = -1, max2 = -1, max3 = -1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > max){
                max3 = max2;
                max2 = max;
                max = numbers[i];
            } else if (numbers[i]> max2 ) {
                max3 = max2;
                max2 = numbers[i];
            } else if (numbers[i]> max3) {
                max3 = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);
    }
}
