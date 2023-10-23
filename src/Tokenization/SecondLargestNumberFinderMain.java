package Tokenization;

public class SecondLargestNumberFinderMain {
    public static void main(String[] args) {
        String input1 = "jk2356ui";
        String input2 = "abd2222";
        int result1 = SecondLargestNumberFinder.findSecondLargestNumber(input1);
        int result2 = SecondLargestNumberFinder.findSecondLargestNumber(input2);
        System.out.println("The second largest number in input1 is: " + result1 );
        System.out.println("The second largest number in input2 is: " + result2 );

    }

}
