package Phase_5.Level_2;

import java.util.Scanner;

public abstract class StringTemplate
{
    Scanner input = new Scanner(System.in);
    String str;
    int l ;

    void setup()
    {
        System.out.print("Enter the String : ");
        str = input.nextLine();
        l = str.length();
    }
    abstract void solve();
}
