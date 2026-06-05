//Take three numbers and check if they can form a Pythagorean triplet.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sides of the Triangle : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int hypo = hypotenuse(a,b,c);
        int sum = 0;

        if(a == hypo)
        {
            hypo = a * a;
            sum = (b * b) + (c * c);
        }
        else if(b == hypo)
        {
            hypo = b * b;
            sum = (a * a ) + (c * c);
        }
        else
        {
            hypo = c * c;
            sum = (a * a) + (b * b);
        }

        if(hypo == sum)
        {
            System.out.println("["+a +", "+ b +", "+ c +"] is a Pythagorean Triplet!!");
        }
        else
        {
            System.out.println("["+a +", "+ b +", "+ c +"] is not a Pythagorean Triplet!!!!!");
        }


    }
    public static int hypotenuse(int a , int b , int c)
    {
        //a is biggest
        if(a > b && a > c)
        {
            return a;
        }
        //b is biggest
        else if(b > a && b > c)
        {
            return b;
        }
        //c is biggest
        else if( c > a && c > b)
        {
            return c;
        }
        //if a,b,c all are equal
        else
        {
            return a;
        }
    }

}
