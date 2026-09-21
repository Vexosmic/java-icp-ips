//Question 4: Write a java program to convert inches to feets and remaining inches.
import java.util.Scanner;
public class InchConverter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter length in inches: ");
        int inches = sc.nextInt();
        int feet = inches / 12;
        int remainingInches = inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
    }
}
