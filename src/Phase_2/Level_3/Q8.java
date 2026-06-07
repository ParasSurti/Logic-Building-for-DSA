//Print first n terms of an arithmetic progression (a, d).
package Phase_2.Level_3;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number (a) : ");
        int a = input.nextInt();

        System.out.print("Enter the number (d) : ");
        int d = input.nextInt();

        System.out.print("Enter the number (n) : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.print(a  + " ");
            a = a + d;
        }
    }
}
