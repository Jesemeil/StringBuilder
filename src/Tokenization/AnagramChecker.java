package Tokenization;

public class AnagramChecker {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] charCount = new int[256];


        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        for (char c : t.toCharArray()) {
            charCount[c]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

}
