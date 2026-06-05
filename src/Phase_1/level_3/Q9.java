// Take two angles of a triangle and compute the third angle.
package Phase_1.level_3;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two sides of the number : ");
        int s1 = input.nextInt();
        int s2 = input.nextInt();

        int sum = s1 + s2;

        int s3 = sum - 180;

        System.out.println(Math.abs(s3) + " is the third angle of the triangle.");

    }
}
