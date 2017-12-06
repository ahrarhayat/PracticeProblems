import java.util.Scanner;

public class Lab5_6 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        double hour;
        System.out.println("Input work hours please : ");
        hour=sc.nextInt();
        double salary;
            if (hour<=40)
            {
                salary = 200*hour;
                System.out.println(salary);
            }
            else {
                salary = 8000+ (300*hour);
                System.out.println(salary);
            }

    }
}
