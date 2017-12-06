public class Lab5_1 {
    public static void main(String args[])
    {
        int x=4;
        int y =18;
        while (x>=0)

        {
            if(x==0)
            {
                System.out.println(y);
            }
           else{
                System.out.print(y + "," + " ");
            }

            y=y+9;
            x=x-1;
        }
    }
}
