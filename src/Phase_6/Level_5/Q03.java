//Validate a password (at least one uppercase, lowercase, digit, special char).
package Phase_6.Level_5;

import java.util.Scanner;

public class Q03
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Password : ");
        String password = input.nextLine();


        boolean oneUpperCase = false;
        boolean oneLowerCase = false;
        boolean oneDigit = false;
        boolean oneSpecialChar = false;
        if(password.length() == 0)
        {
            System.out.println("Enter Valid Password !! ");
            return;
        }
        for (int i = 0; i < password.length(); i++)
        {
            if(hasOneUppercase(password.charAt(i)))
            {
                oneUpperCase = true;
            }
            if(hasOneLowercase(password.charAt(i)))
            {
                oneLowerCase = true;
            }
            if(hasOneDigit(password.charAt(i)))
            {
                oneDigit = true;
            }
            if(hasOneSpecialChar(password.charAt(i)))
            {
                oneSpecialChar = true;
            }
        }
        if(oneUpperCase && oneLowerCase && oneDigit && oneSpecialChar)
        {
            System.out.println("Valid Password !!");
        }
        else System.out.println("Invalid Password !!");

    }
    public static boolean hasOneUppercase(char ch)
    {
        return ch >= 'A' && ch <= 'Z';
    }
    public static boolean hasOneLowercase(char ch)
    {
        return ch >= 'a' && ch <= 'z';
    }
    public static boolean hasOneDigit(char ch)
    {
        return ch >= '0' && ch <= '9';
    }
    public static boolean hasOneSpecialChar(char ch)
    {
        return !hasOneDigit(ch) && !hasOneLowercase(ch) && !hasOneUppercase(ch);
    }
}
