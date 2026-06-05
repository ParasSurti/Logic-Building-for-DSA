//Check if a number is a palindrome.
package Phase_2.Level_2;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int pali = num;
        int rev = 0;
        for (int i = 0; num != 0 ; i++)
        {
            int temp = num % 10;
            num = num / 10;
            rev = (rev * 10) + temp;
        }
        boolean isPalidrome = pali == rev;
        if(isPalidrome)
        {
            System.out.println(pali + " is a palindrome number!! ");
        }
        else
        {
            System.out.println(pali + " is not a palindrome number!! ");
        }
    }

}
