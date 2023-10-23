package Tokenization;

public class SecondLargestNumberFinder {
    public static int findSecondLargestNumber(String input) {
        int largestNumber = 1;
        int secondLargestNumber = 1;
        for(char c : input.toCharArray()){
            if(Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                if(digit > largestNumber){
                    secondLargestNumber = largestNumber;
                    largestNumber = digit;
                }
                else if(digit < largestNumber && digit > secondLargestNumber){
                    secondLargestNumber = digit;
                }
            }


        }


        return secondLargestNumber;
    }

}


















