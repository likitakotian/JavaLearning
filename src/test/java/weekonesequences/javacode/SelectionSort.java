package weekonesequences.javacode;

public class SelectionSort {
    public static void main(String[] args) {
        int input[] = {5, 2, 9, 1, 5, 6};
        sortArray(input);
        for(int i: input){
            System.out.print(i +" ");
        }

    }

    private static void sortArray(int[] input) {
        for(int i=0;i<input.length-1;i++){
            int index= i;
            for(int j= i+1; j<input.length;j++){
                if(input[j]<input[index]){
                    index = j;
                }
            }
            int temp = input[index];
            input[index] = input[i];
            input[i]= temp;
        }
    }
}
