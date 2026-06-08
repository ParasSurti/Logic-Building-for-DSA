//Print a Left-Aligned Triangle starting '1' on each row
package Phase_2.Level_4;

import java.util.Scanner;

public class Q20
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = input.nextInt();


        for (int i = 1; i <= n ; i++)
        {
            int number = 1;
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
