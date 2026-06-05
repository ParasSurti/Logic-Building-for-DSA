//Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x coordinates : ");
        int x = input.nextInt();
        System.out.print("Enter the y coordinates : ");
        int y = input.nextInt();

        boolean isXzero = x == 0 ;
        boolean isYzero = y == 0 ;
        if(isYzero && isXzero)
        {
            System.out.println("[" + x +","+ y + "] point lines lies at origin.");
        }
        else if(isYzero)
        {
            System.out.println("[" + x +","+ y + "] point lines lies at X-axis.");
        }
        else if(isXzero)
        {
            System.out.println("[" + x +","+ y + "] point lines lies at Y-axis.");
        }
        else
        {
            System.out.println("[" + x +","+ y + "] point lines doesn't lies on X-axis & Y-axis.");
        }
    }
}
