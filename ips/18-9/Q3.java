//Enter the number of eggs and display corresponding number of dozens and remaining eggs.
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of eggs: ");
        int eggs = sc.nextInt();
        int dozens = eggs / 12;
        int remainingEggs = eggs % 12;
        System.out.println(eggs + " eggs is equal to " + dozens + " dozens and " + remainingEggs + " eggs.");
    }
}