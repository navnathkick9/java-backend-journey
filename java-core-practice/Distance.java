import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Speed :- ");
        int speed = sc.nextInt();

        System.out.println("Enter the time :- ");
        int time = sc.nextInt();

        int distance = speed/time;

        System.out.println("Distance is :- "+distance);
        
    }
    
}
