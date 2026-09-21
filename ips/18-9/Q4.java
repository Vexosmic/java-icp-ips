//Read 3 sides of a triangle and display area of that triangle.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = sc.nextInt();

        double s = (side1 + side2 + side3) / 2; // semi-perimeter
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)); // Heron's formula

        System.out.println("The area of the triangle is: " + area);
    }
}