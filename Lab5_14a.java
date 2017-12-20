import java.util.Scanner;

public class Lab5_14a {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Array size");
        int ArraySize = scanner.nextInt();
        int [] Array = new int[ArraySize];
        int i =ArraySize-1;
        int min =Array[0];
        int sum = 0;
        while (i>=0)
        {
            System.out.println("Choose your Array values");
            Array[i] = scanner.nextInt();


            if(Array[i]<min)
            {
                min = Array[i];
            }
            sum =sum+ Array[i];
            i=i-1;
        }
        System.out.println("Average is " + sum/ArraySize);
        System.out.println("Minimum is " + min);



    }
}
