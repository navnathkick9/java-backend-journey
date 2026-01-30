// This program reverses a given string.
public class ReverseString {
    public static void main(String[] args) {
        String s = "Navnath";
        String rev = "";
        System.out.println(s);
        for (int i = s.length()-1; i >= 0; i--)
            rev += s.charAt(i);

        System.out.println(rev);
    }
}

// Output:
// Navnath
// htavnaN