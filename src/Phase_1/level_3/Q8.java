//Check if a number lies within the range [100, 999].
package Phase_1.level_3;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        if(num >= 100 && num <= 999 )
        {
            System.out.println(num + " is within the [100 - 999] range.");
        }
        else
        {
            System.out.println(num  + " isn't within the [100 - 999] range.");
        }
    }
}
