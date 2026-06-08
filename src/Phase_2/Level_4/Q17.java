//Print a Left-Aligned Triangle that has different char each cell.
package Phase_2.Level_4;

import java.util.Scanner;

public class Q17
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        char ch = 'A';
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                if(ch > 'Z')
                {
                    ch = 'A';
                }
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
