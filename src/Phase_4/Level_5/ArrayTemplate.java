package Phase_4.Level_5;

import java.util.Scanner;

public abstract class ArrayTemplate
{
    Scanner input = new Scanner(System.in);
    int[] arr;
    int n;

    void setup()
    {
        System.out.print("Enter the size of Array : ");
        n = input.nextInt();

        arr = new int[n];
        for (int i = 0; i < n ; i++)
        {
            arr[i] = input.nextInt();
        }
    }

    abstract void solve();

}
