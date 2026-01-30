import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principal amount:- ");
        int p = sc.nextInt();

        System.out.println("Enter the rate of intrest :- ");
        int r = sc.nextInt();

        System.out.println("Enter the Principal time:- ");
        int t = sc.nextInt();

        int si = (p*r*t)/100;
        
        System.out.println("Your Simple intrest is :- "+si);
    }
}
