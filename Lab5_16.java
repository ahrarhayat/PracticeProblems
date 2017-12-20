import java.util.Scanner;

public class Lab5_16 {
    public static void main(String args [])
    {


        int sum7 =0;
        int sum9=0;
        int Totalsum=0;




        while (Totalsum<300)
        {
            sum7 =sum7+7;
            sum9 = sum9+9;
            Totalsum=Totalsum+sum7+sum9;
            if (Totalsum>300)
            {
              int  diff=Totalsum-300;
              Totalsum=Totalsum-diff;
              break;
            }
        }
        System.out.println(Totalsum);

    }
}
