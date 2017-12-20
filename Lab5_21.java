import java.util.Scanner;

public class Lab5_21 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter a number 2: ");
        double num2 = scanner.nextDouble();
        if (num1 > num2) {
            System.out.println(num1+" is the bigger number");
        } else if (num2 > num1) {

            System.out.println(num2+ " is the bigger number");
        } else {
            System.out.println("The numbers are equal");
        }
    }

}
