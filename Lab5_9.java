import java.util.Scanner;

public class Lab5_9 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        double S;
        System.out.print("Please input S: ");
        S=scanner.nextDouble();
        double  L;
        if(S>=100)
        {
          L=12000/(4+(S*S)/14900);
        }
        else
        {
            L=3000-(125*S*S);
        }
        System.out.println(L);
    }
}
