import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther the number");
        int number = sc.nextInt();

        if (number%2 == 0)
        {
            System.out.println("The Given number is Even");
        }

        else
        {
            System.out.println("The Given Number is Odd");
        }
    }
}
