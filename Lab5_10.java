import java.util.Scanner;

public class Lab5_10 {
    public static void main(String args [])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input n: ");
        double n =scanner.nextDouble();
        double y=0;
        if (n>0) {
            while (n > 0)
            {
           y=Math.cbrt(y+(n*n*n));
           n=n-1;

            }
        }
        else {
            while (n <0)
            {
                y=Math.cbrt(y+(n*n*n));
                n=n+1;
            }
        }
        System.out.println(y);
    }
}
