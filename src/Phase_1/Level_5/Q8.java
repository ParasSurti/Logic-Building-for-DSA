//Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.
package Phase_1.Level_5;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (1-9999) : ");
        int num = input.nextInt();

        if(num > 1 & num > 9999)
        {
            System.out.println("Enter the Number between the given range [1 - 9999]");
            return;
        }

        int integer = num;
        int product = 1;
        int sum = 0;
        int temp = 0;
        for (int i = 0; num != 0; i++)
        {
            temp = num % 10;
            product *= temp;
            sum += temp;
            num = num /10;
        }

        boolean SumLargest = sum > product;
        boolean bothEqual = sum == product;

        if(SumLargest)
        {
            System.out.println("Product of the Integer : "+ product + "\nSum of the Integer : " + sum + "\nTherefore the Sum is Greater than the Product of the Integer!!");
        }
        else if(bothEqual)
        {
            System.out.println("Product of the Integer : "+ product + "\nSum of the Integer : " + sum + "\nBoth the Product & Sum have Equal Values!!");
        }
        else
        {
            System.out.println("Product of the Integer : "+ product + "\nSum of the Integer : " + sum + "\nTherefore the Product is Greater than the sum of the Integer!!");
        }

        input.close();
    }
}
