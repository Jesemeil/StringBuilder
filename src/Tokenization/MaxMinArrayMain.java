package Tokenization;

public class MaxMinArrayMain {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 8, 3, 7, 4, 6};
        int maximum = MaxMinArray.getMaximum(numbers);
        int minimum = MaxMinArray.getMinimum(numbers);
        System.out.println("The maximum = " + maximum + " and the minimum = " + minimum);
    }
}
