package Phase_6;

import java.util.Scanner;

public abstract class  NumberTemplate
{
    protected int num;

    protected void setup()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();
    }
    protected abstract void solve();
}
