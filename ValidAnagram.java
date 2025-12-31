import java.util.Arrays;

public class ValidAnagram {

    public static boolean checkAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        // Sorting
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }

    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        boolean result = checkAnagram(s, t);

        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
