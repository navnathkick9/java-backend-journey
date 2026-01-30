import java.util.Scanner;

public class Bigger {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        if (num1!=num2 && num1>num2)
        {
            System.out.println("Number 1 is Greater than Number 2");
        }

        else
        {
            System.out.println("Number 2 is greater than Number 1");
        }
    }
}
