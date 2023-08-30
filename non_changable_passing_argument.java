public class non_changable_passing_argument
{
    public static void update(int marks[], int unchangable )
    {
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i] +1;
            System.out.println(marks[i]);
        }
    }
    public static void main(String args[])
    {
        int marks[]={99,98,97};
        int unchangable=5;
        update(marks,unchangable);
        System.out.println(unchangable);
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
