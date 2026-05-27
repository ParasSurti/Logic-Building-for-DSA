package Phase_1.Level_2;

import java.util.Scanner;

public class Q1
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
        }
        else
        {
            System.out.println("With the given three sides[" + a + "," + b +","+ c +"], we cannot form a valid triangle. ");
        }
    }
}
