//Print first n terms of a geometric progression (a, r).
package Phase_2.Level_3;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number (a) : ");
        int a = input.nextInt();

        System.out.print("Enter the number (r) : ");
        int r = input.nextInt();

        System.out.print("Enter the number (n) : ");
        int n = input.nextInt();

        for (int i = 1; i <= n ; i++)
        {
            System.out.print(a + " ");
            a = a * r;
        }
    }
}
