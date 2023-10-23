package Tokenization;

public class BackspaceStringCompare {
    public static boolean compare(String s, String t) {
        int index1 = s.length() - 1, index2 = t.length() - 1;
        int skipS = 0, skipT = 0;

        while (index1 >= 0 || index2 >= 0) {
            while (index1 >= 0) {
                if (s.charAt(index1) == '#') {
                    skipS++;
                    index1--;
                } else if (skipS > 0) {
                    skipS--;
                    index1--;
                } else {
                    break;
                }
            }

            while (index2 >= 0) {
                if (t.charAt(index2) == '#') {
                    skipT++;
                    index2--;
                } else if (skipT > 0) {
                    skipT--;
                    index2--;
                } else {
                    break;
                }
            }

            if (index1 >= 0 && index2 >= 0 && s.charAt(index1) != t.charAt(index2)) {
                return false;
            }

            if ((index1 >= 0) != (index2 >= 0)) {
                return false;
            }

            index1--;
            index2--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab#d";
        String t1 = "ac#d";
        System.out.println(compare(s1, t1));

        String s2 = "aq##";
        String t2 = "c#d#";
        System.out.println(compare(s2, t2));

        String s3 = "aq##";
        String t3 = "r#";
        System.out.println(compare(s3, t3));
    }
}
