//Write a java program to find area and volume of a cube.
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the length of a side of the cube: ");
        double side = sc.nextDouble();
        double area = 6 * side * side;
        double volume = side * side * side;
        System.out.println("Area of the cube: " + area);
        System.out.println("Volume of the cube: " + volume);
    }
}
