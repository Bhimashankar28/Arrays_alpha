import java.util.*;
public class smallest_number
{
    public static int getsmaller(int abcd[])
    {
        int number=Integer.MAX_VALUE;
        for(int i=0; i<abcd.length;i++)
        {
            if (number > abcd[i])
            {
                number=abcd[i];
            }
        }
        return number;
    }
    public static void main(String args[])
    {
        int abcd[]={1,2,3,4,5};
        int x=getsmaller(abcd);
        System.out.println(x);
    }
}
