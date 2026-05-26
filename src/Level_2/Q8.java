//Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
package Level_2;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Alphabet character : ");
        char ch = input.next().charAt(0);

        if(ch >= 'a' && ch <= 'm')
        {
            System.out.println(ch + " lies between a & m.");
        }
        else
        {
            System.out.println(ch + " lies between n & z.");
        }
    }
}
