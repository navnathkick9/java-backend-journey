// This program checks if two strings are anagrams of each other.
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s = "listen", t = "silent";

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}
// Output: true