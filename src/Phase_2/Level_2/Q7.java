//Print all prime numbers between 1 and 100.
package Phase_2.Level_2;

public class Q7
{
    public static void main(String[] args)
    {
        System.out.println("HERE ARE ALL THE PRIME NUMBERS (1 to 100)");

        for (int i = 2; i <= 100; i++)
        {
            boolean isPrime = true;

            for (int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.print(i + " ");
            }
        }
    }
}
