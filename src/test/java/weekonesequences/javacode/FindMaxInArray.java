package weekonesequences.javacode;

public class FindMaxInArray {
    public static void main(String[] args) {
        int array[] = { 5, 7, 6, 4, 2, 9,10 ,13,8};
        findMax(array);
    }

    private static void findMax(int[] array) {
        int max = -1;
        for(int i=0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
