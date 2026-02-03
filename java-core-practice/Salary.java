import java.util.Scanner;

public class Salary {
    public static void main(String[] args) 
    {
        System.out.println("Enter the Salary:-");
        Scanner sc = new Scanner(System.in);
        int Salary=sc.nextInt();
        int PA;
        int HRA;
        int EPF;

        int a= Salary - Salary/10;
        PA = Salary - a;

        int b = Salary - PA;

        HRA = b/10;

        int c = Salary - (PA+HRA);

        EPF = c/10;

        int Deduction = EPF + HRA + PA;

        int Net = Salary - Deduction;
        System.out.println("Your Salary is :- "+Salary);
        System.out.println("************************");
        System.out.println("Your PA is :-"+PA);
        System.out.println("************************");
        System.out.println("Your HRA is  "+HRA);
        System.out.println("************************");
        System.out.println("Your EPF is  "+EPF);
        System.out.println("************************");
        System.out.println("Your Total deduction is  "+Deduction);
        System.out.println("************************");
        System.out.println("Your Net salary is credited to your bank account is  "+Net);
    }
}
