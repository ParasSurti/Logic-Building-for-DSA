//Find the sum of all elements except the largest and smallest.
package Phase_4.Level_5;

import java.util.Arrays;

public class Q06 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q06 q = new Q06();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        if(n <= 2)
        {
            System.out.println("Sum = 0");
            return;
        }

        //Finding the index of smallest Element
        int smallest = small(arr,n - 1,0,Integer.MAX_VALUE);
        //Finding the index of Largest Element
        int largest = large(arr,n - 1,0,Integer.MIN_VALUE);
        //filtering the largest & smallest Element by knowing its index & adding their sum
        int sum = fillArr2(arr, n - 1, smallest, largest, 0);
        System.out.println("Sum of all element except Largest & Smallest : " + sum);
    }
    static int small(int[] arr, int n, int index, int store )
    {
        if(n < 0) return index;
        if(arr[n] < store)
        {
            store = arr[n];
            index = n;
        }
        return small(arr,n-1,index,store);
    }
    static int large(int[] arr, int n, int index, int store)
    {
        if(n < 0) return index;
        if(arr[n] > store)
        {
            store = arr[n];
            index = n;
        }
        return large(arr,n - 1, index, store);
    }
    static int fillArr2(int[] arr,int n, int small, int large, int sum)
    {
        if(n < 0) return sum;
        if(n != small && n != large)
        {
            sum += arr[n];
        }
        return fillArr2(arr,n - 1, small, large, sum);
    }
}
