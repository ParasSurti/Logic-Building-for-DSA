//Take a character and check whether it’s uppercase, lowercase, a digit, or a special character.
package Level_1;

import java.lang.*;
import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Character : ");
        char ch = input.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z')
        {
            System.out.println("'" + ch + "'" + " its a uppercase ");
        }
        else if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("'" + ch + "'" + " its a lowercase ");
        }
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println("'" + ch + "'" + " its a Digit ");
        }
        else
        {
            System.out.println("'" + ch + "'" +" its a special character");
        }

    }
}
