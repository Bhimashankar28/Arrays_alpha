/*
ArrayList<Integer> list=new ArrayList<>();    SYNTAX
objext_name.list.contains(index_value)       element is present or not
 */

import java.util.*;
import java.util.ArrayList;
public class dddd_array_list
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);


    for(int i=0; i<5; i++)
    {
        list.add(sc.nextInt());
    }
     for(int i=0; i<5; i++)
    {
        System.out.println(list.get(i));
    }

       
     System.out.println(list.contains(3));
    }
}
