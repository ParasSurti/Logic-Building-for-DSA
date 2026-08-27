//Simulate a simple calculator using switch-case.
package Phase_6.Level_5;

import java.util.Scanner;

public class Q04
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your first Digit : ");
        int digit1 = input.nextInt();
        System.out.print("Enter Your Second Digit : ");
        int digit2 = input.nextInt();

        int sum = 0;
        System.out.print("Enter your Operations (* , % , / , + , -) : ");
        String operation = input.next();


        switch (operation)
        {
            case "+" : sum = digit1 + digit2;
                break;
            case "-" : sum = digit1 - digit2;
                break;
            case "*" : sum = digit1 * digit2;
                break;
            case "%" :
                if (digit2 == 0)
                {
                    System.out.println("Cannot divide by zero !!");
                    return;
                }
                sum = digit1 % digit2;
                break;
            case "/" :
                if (digit2 == 0)
                {
                    System.out.println("Cannot divide by zero !!");
                    return;
                }
                sum = digit1 / digit2;
                break;

            default:
                System.out.println("Enter Valid Operator !! ");
                return;
        }

        System.out.println(sum);
    }


}
