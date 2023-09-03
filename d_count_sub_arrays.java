import java.util.*;
public class d_count_sub_arrays {
    public static void subarrays(int numbers[])
    {
        int count=0;
        for(int i=0;i<numbers.length;i++)
        {
            int start=i;
            for(int j=i;j<numbers.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                    System.out.print(numbers[k] +"");
            }
            count++;
            System.out.println();
        }
        System.out.println();
    }
    

    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5};
        subarrays(numbers);

    }
}
