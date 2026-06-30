//Check if the array is sorted in ascending order.
package Phase_4.Level_5;

import java.util.Scanner;

public class Q01 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q01 q = new Q01();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        boolean check = order(arr,n,0,1);
        if(check)
        {
            System.out.println("the array is sorted in ascending order.");
        }
        else
        {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
    static boolean order(int[] arr, int n ,int i,int j)
    {
        if(j >= n) return true;
        if(arr[i] > arr[j])
        {
            return false;
        }
        return order(arr,n, i + 1,j + 1);
    }
}
