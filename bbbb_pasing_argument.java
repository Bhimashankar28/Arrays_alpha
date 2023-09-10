import java.util.*;
public class bbbb_pasing_argument
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        System.out.println(Arrays.toString(arr));
        tochange(arr);     // just call function without datatype
        System.out.println(Arrays.toString(arr));
    }
    public static void tochange(int arr[])
    {
     arr[0]=5;       //dont need to write datatype
    }
}
