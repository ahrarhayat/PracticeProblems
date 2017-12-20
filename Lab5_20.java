import java.util.Scanner;

public class Lab5_20 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Final Marks");
        double FinalMarks = scanner.nextDouble();

        if (FinalMarks >= 90 && FinalMarks<=100) {
            System.out.println("A");
        } else if (FinalMarks >= 85 && FinalMarks <= 89) {
            System.out.println("A-");
        } else if (FinalMarks >= 80 && FinalMarks <= 84) {
            System.out.println("B+");
        } else if (FinalMarks >= 75 && FinalMarks <= 79) {
            System.out.println("B");
        } else if (FinalMarks >= 70 && FinalMarks <= 74) {
            System.out.println("B-");
        } else if (FinalMarks >= 65 && FinalMarks <= 69) {
            System.out.println("C+");
        } else if (FinalMarks >= 60 && FinalMarks <= 64) {
            System.out.println("C");
        } else if (FinalMarks >= 57 && FinalMarks <= 59) {
            System.out.println("C-");
        } else if (FinalMarks >= 55 && FinalMarks <= 56) {
            System.out.println("D+");
        } else if (FinalMarks >= 52 && FinalMarks <= 54) {
            System.out.println("D");
        } else if (FinalMarks >= 50 && FinalMarks <= 51) {
            System.out.println("D-");
        } else if (FinalMarks < 50) {
            System.out.println("F");
        } else {
            System.out.println("Invalid entry");
        }

    }
}
