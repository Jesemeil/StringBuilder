package Tokenization;

public class ArrayShuffler {
    public static int[] removeEvenNumbers(int[] array) {
        int count = 0;
        for(int element: array){
            if(element % 2 != 0){
                count++;
            }
        }
        int[] arr = new int [count];
        int index = 0;
        for(int element: array){
            if(element % 2 != 0){
                arr[index] =element;
                index++;

            }
        }

        return arr;
    }

}
















//package Tokenization;
//
//public class ArrayShuffler {
//    public static int[] removeEvenNumbers(int[] array) {
//        // Create a dynamic list to store elements that pass the condition
//        java.util.List<Integer> list = new java.util.ArrayList<>();
//
//        for (int number : array) {
//            if (number % 2 != 0) {
//                list.add(number);
//            }
//        }
//
//        // Convert the list to an array
//        int[] result = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            result[i] = list.get(i);
//        }
//
//        return result;
//    }
//}


//package Tokenization;
//
//public class ArrayShuffler {
//    public static int[] removeEvenNumbers(int[] array) {
//        int count = 0;
//
//        // Count the number of odd elements in the input array
//        for (int element : array) {
//            if (element % 2 != 0) {
//                count++;
//            }
//        }
//
//        int[] arr = new int[count];
//        int arrIndex = 0; // Index for the new array
//
//        // Iterate through the input array and copy odd elements to the new array
//        for (int index = 0; index < array.length; index++) {
//            if (array[index] % 2 != 0) {
//                arr[arrIndex] = array[index];
//                arrIndex++;
//            }
//        }
//
//        return arr;
//    }
//}
