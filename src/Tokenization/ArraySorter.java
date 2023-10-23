package Tokenization;

import java.util.Arrays;

public class ArraySorter {
    public static int[] sortArray(int[] arr) {
       for(int index1 = 0; index1 < arr.length -1; index1++){
           for(int index2 = 0; index2 <arr.length -index1 -1; index2++){
               if(arr[index2] > arr[index2 + 1]){
                   int temp = arr[index2];
                   arr[index2] = arr[index2 + 1];
                   arr[index2 + 1] = temp;
               }
           }
       }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {200, 1, 25, 6, 2, 3};
        int[] sortedArray = ArraySorter.sortArray(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
}
