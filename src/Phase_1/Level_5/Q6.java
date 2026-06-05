//Take three numbers and check if they are in geometric progression.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1 number : ");
        int a = input.nextInt();
        System.out.print("Enter the 2 number : ");
        int b = input.nextInt();
        System.out.print("Enter the 3 number : ");
        int c = input.nextInt();

        // (b * b) = a * c;

        int LHS = b * b;
        int RHS = a * c;

        boolean isGP = LHS == RHS;

        if(isGP)
        {
            System.out.print("[" + a + ", " + b + ", " + c + "] are in Geometric Progression.");
        }
        else
        {
            System.out.println("[" + a + ", " + b + ", " + c + "] are not in Geometric Progression!!!!");
        }
    }
}
