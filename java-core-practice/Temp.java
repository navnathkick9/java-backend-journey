import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther the number");
        int a = sc.nextInt();

         System.out.println("Enther the number");
        int b = sc.nextInt();

        a= a+b; //5 & 10
        b=a-b;
        a=b-a;

         System.out.println("Value of a is :- " +a+ " value of b is " +b);
    }
}
