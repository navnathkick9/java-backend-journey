import java.util.Scanner;

public class Perc {
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

        if(percentage >= 90 && percentage<100)
        {
            System.out.println("Outstanding");
        }

        else if(percentage>=80 && percentage <=90)
        {
             System.out.println("Excellanet");
        }

         else if(percentage>=70 && percentage <=80)
        {
             System.out.println("Average");
        }

         else if(percentage>=60 && percentage <=70)
        {
             System.out.println("Good");
        }

         else if(percentage>=50 && percentage <=60)
        {
             System.out.println("Pass");
        }

         else if(percentage>=40 && percentage <=50)
        {
             System.out.println("Cut off");
        }

         else
        {
             System.out.println("Failed");
        }
    }
}

