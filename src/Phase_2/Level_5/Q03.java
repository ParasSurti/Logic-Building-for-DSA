//Print all numbers that are palindromes between 1–500.
package Phase_2.Level_5;

public class Q03
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 500; i++)
        {
            int num = i;
            int pali = num;
            int rev = 0;
            while(num != 0)
            {
                int temp = num % 10;
                rev = (rev * 10) + temp;
                num /= 10;
            }
            if(rev == pali)
            {
                System.out.print( rev + " ");
            }
        }
    }
}