//array       = -2 -3 4 -1 -2 1 5 -3
// current sum= 0   0 4  3  1 2 7  4
// max sum    = 0   0 4 4 4 4 7 7                             max sum is 7
// O(n) time complexity

import java.util.*;
public class g_kadanes_max_subarray_sum
{
    public static void kadanes(int numbers[])
    {
        int ms= Integer.MIN_VALUE;
        int cs=0;

        for(int i=0; i<numbers.length;i++)
        {
            cs=cs + numbers[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Our max subarrays sum is:" + ms);
    }
    public static void main(String args[])
    {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
