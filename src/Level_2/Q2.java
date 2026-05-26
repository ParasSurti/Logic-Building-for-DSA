//If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
package Level_2;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side's : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a + b > c && a + c > b && b + c > a)
        {
            System.out.println("With the given three sides [" + a + "," + b +","+ c +"], We can form a valid triangle. ");

            if(a == b && b == c)
            {
                System.out.println("We can say its a equilateral triangle. \nBy the Triangle sides [" + a + "," + b + "," + c + "],");
            }
            else if(a == b || b == c || a ==c)
            {
                System.out.println("We can say its a isosceles triangle. \nBy the Triangle sides [" + a + "," + b +"," + c + "].");
            }
            else
            {
                System.out.println("We can say its a scalene triangle. \nBy the Triangle sides [" + a + "," + b + "," + c + "].");
            }
        }
        else
        {
            System.out.println("We cannot form a valid triangle. \n With the given three sides[" + a + "," + b +","+ c +"].  ");
        }
    }
}
