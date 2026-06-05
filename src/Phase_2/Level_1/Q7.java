//Print the sum of all even numbers up to n.
package Phase_2.Level_1;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int sum = 0;
        for (int i = 0; i <= num; i++)
        {
            boolean isEven = i % 2 == 0 ;
            if(isEven)
            {
                sum += i;
            }
        }
        System.out.println("The sum of the even numbers upto '" + num +"th' number is " + sum);
    }
}
