//Question 3: Write a java program to enter number of days and display number of months and number of remaining days. Assume average days per month as 30.
import java.util.Scanner;
public class DayCounter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number of days: ");
        int days = sc.nextInt();
        int months = days / 30;
        int remainingDays = days % 30;
        System.out.println(days + " days is equal to " + months + " months and " + remainingDays + " days.");
    }
}
