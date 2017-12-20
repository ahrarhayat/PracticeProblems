import java.util.Scanner;

public class Lab5_18 {
    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        Double Num[] = new Double[10];
        double sum=0;
        double average;
        double count=0;


        for (int i = 0; i <= 9; i++) {
            System.out.println("Please enter the number: ");
            Double num = scanner.nextDouble();
            Num[i] = num;

        }
        for (int i = 0; i <= 9; i++) {
            if (Num[i] % 2 == 0) {

                sum=sum+Num[i];
                count=count+1;
            } else {



            }
        }

        average = sum/count;
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);


    }
}
