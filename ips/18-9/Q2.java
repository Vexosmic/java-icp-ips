//Enter the distance between 2 places in terms of meters, and display its equivalent in terms of kilometers and the remaining meters.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        int meters = sc.nextInt();
        int kilometers = meters / 1000;
        int remainingMeters = meters % 1000;
        System.out.println(meters + " meters is equal to " + kilometers + " kilometers and " + remainingMeters + " meters.");
    }
}
