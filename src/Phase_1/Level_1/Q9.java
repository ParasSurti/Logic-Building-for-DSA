//Take a character and check if it’s a vowel or consonant.
package Phase_1.Level_1;

import java.util.Scanner;

public class Q9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Character : ");
        String ch = input.next();

        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u"))
        {
            System.out.println(ch + " is a vowel.");
        }
        else
        {
            System.out.println(ch + " is a consonant.");
        }
    }
}
