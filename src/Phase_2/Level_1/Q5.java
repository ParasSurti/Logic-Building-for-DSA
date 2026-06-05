//Print the table of a given number (n × 1 to n × 10).
package Phase_2.Level_1;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        for (int i = 1; i <= 10 ; i++)
        {
            int table = num * i;
            System.out.println(table);
        }
    }
}
