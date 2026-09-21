//Write a java program to compute equivalent fahrenheit value by reading a celsius degree value using the formula F = (9/5) * C + 32.
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (9.0/5.0) * celsius + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}