import java.util.Scanner;

public class Substraction {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number :-");
        int Number1 = sc.nextInt();

        System.out.println("Enter the Second Number :-");
        int Number2 = sc.nextInt();

        int substraction = Number1 - Number2;
        System.out.println("Substraction of two number is :- " +substraction);
    }
}
