//Take a character and check if it is a letter, a digit, or neither.
package Phase_1.Level_4;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char c = input.nextLine().charAt(0);
        if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
        {
            System.out.println(c + " is a letter.");
        }
        else if(c >= '0' && c <= '9')
        {
            System.out.println(c + " is a digit.");
        }
        else
        {
            System.out.println( c + " is neither letter & digit.");
        }

    }


}
