//Take a password string and check basic rules (length ≥ 8 and contains at least one digit).
package Phase_1.Level_4;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password : ");
        String pswd = input.nextLine();

        boolean cond1 = pswd.length() >= 8;
        boolean cond2 = pswd.matches(".*[0-9].*");
        if(cond1 && cond2)
        {
            System.out.println(pswd + " Your password is Strong. Since it contains numbers & its length is bigger than 7");
        }
        else
        {
            System.out.println(pswd + " Your password isn't Strong. Since it doesn't contains numbers & its length isn't bigger than 7");
        }
    }
}
