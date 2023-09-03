// [1,-2,6,-1,3]
// prefix array will be== [1,-1,5,4,7]       prefix[i-1]+arr[i]
// prefix[end]-prefix[start-1]
//time complexity will be O(n^2)

import java.util.*;
public class f_prefix_array_max_subarray_sum
{
    public static void maxSubarraySum(int numbers[])
    {
        int currSum=0;
        int maxSum= Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0] = numbers[0];
        // calculating prefix array
        for(int i=1; i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1] +numbers[i];
        }

        for(int i=0; i<numbers.length; i++)
        {
            int start=i;
            for(int j=1; j<numbers.length;j++)
            {
                int end =j;
                currSum=start == 0 ? prefix[end] :prefix[end]-prefix[start-1];
                if(maxSum < currSum)
                {
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum=" + maxSum);
    }
    public static void main(String args[])
    {
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
