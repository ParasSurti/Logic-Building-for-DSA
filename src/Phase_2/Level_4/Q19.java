//Print a Centered Pyramid with sequential characters A-Z
package Phase_2.Level_4;

import java.util.Scanner;

public class Q19
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = input.nextInt();

        char ch = 'A';
        for (int i = 1; i <= n ; i++)
        {
            //for spaces
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            //Characters
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
