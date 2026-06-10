//Print numbers between 1–100 whose digits add up to a multiple of 3.
package Phase_2.Level_5;

public class Q04
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            int num = i;
            int sum = 0;
            while(num != 0)
            {
                int temp = num % 10;
                sum += temp;
                num /= 10;
            }
            if(sum % 3 == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
