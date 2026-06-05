//Take three numbers and check if they are in arithmetic progression.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q5
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

        int d1 = b - a;
        int d2 = c - b;
        boolean isAP = d1 == d2;
        if(isAP)
        {
            System.out.println("[" + a + ", " + b + ", " + c + "] is are in Arithmetic Progression." );
        }
        else
        {
            System.out.println("[" + a + ", " + b + ", " + c + "] is are not in Arithmetic Progression!!" );
        }
    }
}
