//Print the sum of first n natural numbers.
package Phase_2.Level_1;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        for (int i = 1; i <= num ; i++)
        {
            System.out.println(i);
        }
    }
}
