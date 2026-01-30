import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Marathi :- ");
        int Marathi = sc.nextInt();

        System.out.println("Enter the marks of English :- ");
        int English = sc.nextInt();

        System.out.println("Enter the marks of Hindi :- ");
        int Hindi = sc.nextInt();

        System.out.println("Enter the marks of History :- ");
        int History = sc.nextInt();

        System.out.println("Enter the marks of Science :- ");
        int Science = sc.nextInt();

        int percentage = (Marathi+English+Hindi+History+Science)/5;
        System.out.println("Percentage is :- " +percentage);

        if(percentage>35)
        {
            System.out.println("PASS");
        }

        else
        {
             System.out.println("FAILED");
        }
    }
}

