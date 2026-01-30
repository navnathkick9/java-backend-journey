import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther the number");
        int a = sc.nextInt();

         System.out.println("Enther the number");
        int b = sc.nextInt();

        int temp = a;
             a = b;
             b = temp;
        System.out.println("Value of a is :- " +a+ " value of b is " +b);

    }
}
