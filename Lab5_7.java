import java.util.Scanner;

public class Lab5_7 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        Double CGPA;
        System.out.println("Input your CGPA");
        CGPA=sc.nextDouble();
        if (CGPA<2)
        {
            System.out.println("Your CGPA is less than 2, you're in probation.");
        }
        else if(CGPA<2.5)
        {
            System.out.println("Your CGPA is less than 2.5, you're a loser.");
        }
        else if (CGPA<3)
        {
            System.out.println("Your CGPA is less than 3, try harder.");
        }
        else if(CGPA>4)
        {
            System.out.println("You're retarded");
        }
        else {
            System.out.println("Thumbs up!");
        }
    }
}
