package Tokenization;

public class Subset {
    public static boolean isSubset(String s, String t) {
        int sIndex = 0;
        for(char c: t.toCharArray()) {
            if(sIndex < s.length() && s.charAt(sIndex) == c) {
                sIndex++;
            }
        }
        return sIndex == s.length();
    }
}


