import java.util.Scanner;

public class Lab5_8 {
    public static void main(String args[])
    {
        int x =9;
        int y =9;
        int z =9;
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double [] marks = new double[10];
        double average ;

        while (x>0)
        {
            System.out.print("Please enter your marks: ");
           double temp=scanner.nextDouble();
           marks[x]= temp;
            sum = sum+marks[x];
            x=x-1;

        }
        average = sum /10 ;
        System.out.println("Average is : "+ average);

        double min=marks[y];
      while (y>0) {
          min = marks[y];
          y=y-1;
          if ((min<marks[y]))
          {
              min = marks[y];
          }

      }
        System.out.println("Min is : "+ min);


        double max = marks[z];
      while ( z>0)
      {

          z=z-1;
          if (max>marks[z])
          {

          }
          else {
              max=marks[z];
          }


      }
        System.out.println("Max is : " +max
        );







    }

}
