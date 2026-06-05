//Print the squares of numbers from 1 to n.
package Phase_2.Level_3;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int j = 1;
        int sq = 1;
        for (int i = 1; i <= num; i++)
        {
            sq = i * j;
            System.out.println(i + " x "+ j + " = " + sq);
            j++;
        }
    }
}
