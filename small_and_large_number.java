import java.util.*;
public class small_and_large_number
{
    public static int getnumber(int number[])
    {
        int num1=Integer.MIN_VALUE;
        int num2=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(num1<number[i])
            {
                num1=number[i];
            }
            if(num2>number[i])
            {
                num2=number[i];
            }
        }
        System.out.println("Smallest no is :" + num2);
        return num1;
    }
   public static void main(String args[])
   {
       int number[]={1,2,3,4,5,6};
       System.out.println("Greatest no is :" + getnumber(number));
   }
}
