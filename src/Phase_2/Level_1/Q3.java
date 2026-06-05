//Print all the odd the numbers between 1 and 100.
package Phase_2.Level_1;

public class Q3
{
    public static void main(String[] args)
    {
        int start = 0;
        int end = 100;

        for (start = 0; start <= end ; start++)
        {
            boolean isEven = start % 2 == 0;
            if(!isEven)
            {
                System.out.println(start);
            }
        }
    }
}
