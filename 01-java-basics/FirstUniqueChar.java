// This program finds the first unique character in a string.
public class FirstUniqueChar {
    public static void main(String[] args) {
        String s = "swiss";
        int[] charCount = new int[256];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)] == 1) {
                System.out.println("First unique character: " + s.charAt(i));
                return;
            }
        }

        System.out.println("No unique character found.");
    }   
}
// Output: First unique character: w
