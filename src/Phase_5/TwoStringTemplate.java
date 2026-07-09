package Phase_5;

import java.util.Scanner;

public abstract class TwoStringTemplate
{
    Scanner input = new Scanner(System.in);
    protected String str1,str2;
    protected int l1,l2;

    protected void setup()
    {
        System.out.print("Enter 1st String : ");
        str1 = input.nextLine();
        l1 = str1.length();


        System.out.print("Enter 2nd String : ");
        str2 = input.nextLine();
        l2 = str2.length();
    }
    protected abstract void solve();
}
