import java.util.ArrayList;
import java.util.Scanner;

public class Lab5_15 {
public static void main(String args [])
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scanner.nextInt();
    int s = n-1;
    int sum =0;
    int Totalsum=0;




    while (sum<s)
    {
        sum =sum+7;
        Totalsum=Totalsum+sum;
    }
    System.out.println(Totalsum);

}
}
