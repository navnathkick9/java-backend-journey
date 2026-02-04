import java.util.Scanner;

public class Discount {
    public static void main(String[] args) 
    {
        System.out.println("Enter Shopping Amount :- ");

        Scanner sc = new Scanner(System.in);
        int Amount = sc.nextInt();
        int Discount;
        int net_amount;

        if(Amount<10000)
        {
            System.out.println("Shopping Amount :- "+Amount);
            net_amount = Amount - (Amount)/10;

            System.out.println("Your Net Payable Amount is :-"+net_amount);
            Discount = Amount - net_amount;

            System.out.println("Your Discount is :-"+Discount);

            
        }

         if(Amount>=10000 && Amount<=12000)
        {
            System.out.println("Shopping Amount :- "+Amount);
            net_amount = Amount - (Amount*6)/50;

            System.out.println("Your Net Payable Amount is :-"+net_amount);
            Discount = Amount - net_amount;

            System.out.println("Your Discount is :-"+Discount);

            
        }

         if(Amount>12000 &&  Amount<=15000)
        {
            System.out.println("Shopping Amount :- "+Amount);
            net_amount = Amount - (Amount*3)/20;

            System.out.println("Your Net Payable Amount is :-"+net_amount);
            Discount = Amount - net_amount;

            System.out.println("Your Discount is :-"+Discount);

            
        }

         if(Amount>15000 &&  Amount<=20000)
        {

            System.out.println("Shopping Amount :- "+Amount);
            net_amount = Amount - Amount/5;

            System.out.println("Your Net Payable Amount is :-"+net_amount);
            Discount = Amount - net_amount;

            System.out.println("Your Discount is :-"+Discount);

            
        }
    }
}
