// Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
package Level_2;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Marks : ");
        float marks = input.nextFloat();

        if(marks >= 90 && marks < 100)
        {
            System.out.println("Your marks is " + Math.round(marks) + ", So Your Grade is A+.");
        }
        else if(marks >=80 && marks < 90)
        {
            System.out.println("Your marks is " + Math.round(marks) + ", So Your Grade is A.");
        }
        else if(marks >= 70 && marks < 80)
        {
            System.out.println("Your marks is " + Math.round(marks) + ", So Your Grade is B.");
        }
        else if(marks >= 60 && marks <70)
        {
            System.out.println("Your marks is " + Math.round(marks) + ", So Your Grade is C.");
        }
        else if(marks >= 50 && marks <60)
        {
            System.out.println("Your marks is " + Math.round(marks) + ", So Your Grade is D.");
        }
        else
        {
            System.out.println("Your marks is " + Math.round(marks) + ", So Your Grade is F. \nYou have Failed.");
        }
    }

}
