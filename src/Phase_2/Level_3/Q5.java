//Find LCM of two numbers using loops.
package Phase_2.Level_3;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        int a = input.nextInt();

        System.out.print("Enter your 2nd number : ");
        int b = input.nextInt();


        int lcm = 1;
        for (int i = Math.max(a,b); ; i++)
        {
            if( i % a == 0 && i % b == 0)
            {
                lcm = i;
                break;
            }
        }
        System.out.println("LCM of (" + a + ", " + b + ") : " + lcm);
    }
}
