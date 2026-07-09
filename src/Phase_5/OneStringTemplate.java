package Phase_5;

import java.util.Scanner;

public abstract class OneStringTemplate
{
    protected Scanner input = new Scanner(System.in);
    protected String str ;
    protected int l ;

    protected void setup()
    {
        System.out.print("Enter a String : ");
        str = input.nextLine();
        l = str.length();
    }

    protected abstract void solve();
}


