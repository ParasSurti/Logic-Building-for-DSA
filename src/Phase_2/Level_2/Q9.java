// Print Fibonacci series up to n terms.
 package Phase_2.Level_2;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int a = 0 , b = 1;
        for (int i = 0; i < num ; i++)
        {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b =  next;
        }
    }
}
