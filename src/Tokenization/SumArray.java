package Tokenization;

public class SumArray {
    public static int getTotal(int[] arr) {
        int total = 0;
        for (int index : arr) {
            total += index;
        }

        return total;
    }
}
