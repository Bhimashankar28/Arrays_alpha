/*
arrays values are store in heap memory  // it is in run time
int arr[] is store in stack memory // it is in compile time
array object are in heap memory
heap object are not continuous
dynamic memory allocation
it not may be continuous
nextLine();   use for string input
Arrays.toString(Variable_name)     use for []
 */

import java.util.*;
public class aaaabasics
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        /*
        int arr[]=new int[5];
        System.out.println(arr[1]);               // null value for int is o

        String sarr[]=new String[5];
        System.out.println(sarr[1]);        // string value is NULL


        //input using for loop
        for(int i=0; i<arr.length; i++)
        {
             arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++)
        {
           System.out.println(arr[i]);
        }


        // second method
        for(int arrs :arr)
        {
            System.out.println(arrs);
        }
        */
        String arr[]=new String[5];
        for(int i=0; i<arr.length; i++)
        {
          arr[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(arr));


        // changing value
        arr[1]="Ashish";
        System.out.println(Arrays.toString(arr));

    }
}
