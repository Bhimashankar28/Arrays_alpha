import java.util.*;
public class largest_number
{
    public static int getlargest(int marks[])
    {
        int number = Integer.MIN_VALUE;
        for (int i=0; i<marks.length; i++)
        {
            if (number<marks[i])
            {
                number = marks[i];
            }
        }
        return number;
    }
    public static void main(String args[])
    {
        int marks[]={1,2,3,4,5};
        int b=getlargest(marks);
        System.out.println("largest no is" + b);
    }
}
