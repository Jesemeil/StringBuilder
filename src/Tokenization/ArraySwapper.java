package Tokenization;

import java.util.Arrays;

public class ArraySwapper {

    public static int[] moveZerosToTheEnd(int[] arr) {
        int nonZeroCounter = 0;

        for (int index = 0; index < arr.length; index++){
            if(arr[index] != 0){
                int temp = arr[index];
                arr[index] = arr[nonZeroCounter];
                arr[nonZeroCounter] = temp;
                nonZeroCounter++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 5, 0, 6, 0, 7, 8, 9};
        int[] result = ArraySwapper.moveZerosToTheEnd(arr);
        System.out.println(Arrays.toString(result));
    }
}

