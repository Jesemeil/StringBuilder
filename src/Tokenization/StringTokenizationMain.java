package Tokenization;

import Tokenization.StringTokenization;

public class StringTokenizationMain {
    public static void main(String[] args) {
        String text = "Aghogho is a successful Software Engineer";
        String [] result = StringTokenization.split(text);
        for (String tokens : result){
            System.out.println(tokens);
        }
    }
}

