import java.util.*;
public class simple
{
    public static void main(String args[])
    {
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 subjects marks");

         marks[0]=sc.nextInt();
         marks[1]=sc.nextInt();
         marks[2]=sc.nextInt();

        System.out.println("phy =" + marks[0]);
        System.out.println("che =" + marks[1]);
        System.out.println("math =" + marks[2]);

        System.out.println( marks.length);
        int per=((marks[0]+ marks[1]+ marks[3])/300)*100;
        System.out.println("Percentage=" + per);
    }
}
