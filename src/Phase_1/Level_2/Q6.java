//Check voting eligibility for a given age (18+)
package Phase_1.Level_2;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = input.nextInt();

        if(age >= 18)
        {
            System.out.println("You are eligible to vote!!");
        }
        else
        {
            System.out.println("You are not eligible to vote!!");
        }
    }
}
