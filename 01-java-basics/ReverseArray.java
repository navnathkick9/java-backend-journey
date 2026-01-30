// This program reverses an array of integers.
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        // Reverse the array
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
// Output: Reversed array: 5 4 3 2 1
