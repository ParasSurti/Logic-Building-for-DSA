//Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
package Phase_1.Level_4;

import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = input.nextInt();
        System.out.print("Enter the income : ");
        double income = input.nextDouble();

        boolean age_flag = age > 18;
        boolean income_flag = income > 500000;

        String incomeStr = (income == Math.floor(income))
                ? String.valueOf((long) income)
                : String.valueOf(income);

        if(age_flag && income_flag)
        {
            System.out.println("The person with an age of " + age + " & with an income of " + incomeStr  + " is Eligible for tax.");
        }
        else
        {
            System.out.println("The person with an age of " + age + " & with an income of " + incomeStr + " isn't Eligible for tax." );
            if(!age_flag && !income_flag)
            {
                System.out.println("The person isn't Eligible for Tax, Because of both AGE & INCOME! ['" + age + "', '" + incomeStr + "']" );
            }
            else if(!income_flag)
            {
                System.out.println("The person isn't Eligible for Tax, because of Income! ['" + income + "']" );
            }
            else
            {
                System.out.println("The person isn't Eligible for Tax, Because of Age! ['" + age + "']");
            }
        }
        input.close();
    }
}
