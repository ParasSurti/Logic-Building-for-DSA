//Print all numbers from 1–n whose binary representation has an even number of 1s.
package Phase_2.Level_5;

import java.util.Scanner;

public class Q06
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (you dont the even number): ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++)
        {
            int num = i;
            int count = 0;

            while(num != 0)
            {
                int temp = num % 2;
                num /= 2;
                if(temp == 1)
                {
                    count++;
                }

            }
            if(count % 2 == 0 && count != 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
