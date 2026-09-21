import java.util.Scanner;
//We import the Scanner class to read input from the user.
public class DisplayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //We create a Scanner object reference to read input from the user.
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        //nextInt() method is used to send the input from keyboard to memory.
        System.out.println("Number is: " + num);
        //+ here works as a concatenation operator to join the string and the number.
    }
}
