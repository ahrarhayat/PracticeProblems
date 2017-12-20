import java.util.*;
import java.io.*;
public class Hackerrank {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        int sum=0;

        for(int i=0;i<t;i++){
            int a = in.nextInt();

            int b = in.nextInt();

            int n = in.nextInt();
            while(n>0)
            {



                int Sout=a+(2^n)*b+sum;
                sum = (2^n)*b;
                System.out.print(Sout+ " ");
                n=n-1;
            }

        }


        in.close();
    }
    }


