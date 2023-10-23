package Tokenization;

public class StringTokenization1Main {
    public static void main(String[] args) {
        StringTokenization1 tokenizer = new StringTokenization1();
        String text = "GOd has been awesome in my life";
        String [] result = tokenizer.split(text);
        for(int index = 0; index < result.length; index++){
            System.out.print(result[index] + " ");
        }


    }
}
