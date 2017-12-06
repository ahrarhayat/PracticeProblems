import java.util.Scanner;

public class Lab5_4 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter n");
        double n = sc.nextInt();
        double y ;
        double sum=0;

        while (n>0)
        {
            y = n/(2*n -1);
            sum=sum+y;
            n=n-1;
           /* System.out.println("The sum is: " + sum);*/
        }
        System.out.println("The sum is: " + sum);

    }
}
