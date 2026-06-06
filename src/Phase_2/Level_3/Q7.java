//Check if a number is a strong number (sum of factorials of digits == number).
package Phase_2.Level_3;

import java.util.Scanner;

public class Q7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int value = num;

        int sum = 0;
        while(num != 0)
        {
            int temp = num % 10;

            //METHOD CALL
            sum += Factorial(temp);
            num = num / 10;
        }
        boolean strong = sum == value;
        if(strong)
        {
            System.out.println(value + " is a strong number!!!");
        }
        else
        {
            System.out.println(value + " isn't a strong number!!!");
        }
    }
    public static int Factorial(int temp)
    {
        int product = 1;
        for (int j = temp; j > 1; j--)
        {
            product = product * j;
        }
        return product;
    }
}
