//Take a year and print the corresponding century
package Phase_1.Level_5;

import java.util.Scanner;

public class Q10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = input.nextInt();

        int century = (year - 1)/ 100 + 1;

        System.out.println("Century of the year " + year + " is " + century);
    }
}
