//Compare two arrays — check if they contain the same elements (ignore order).
package Phase_4.Level_4;

import java.lang.Integer;
import java.util.Scanner;

public class Q02 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q02 q = new Q02();
        q.setup();
        q.solve();

    }
    @Override
    void solve()
    {
        boolean check = cmp(arr1,arr2,n - 1, 0);
        if(check) System.out.println("Both Arrays have same Element!!");
        else System.out.println("Both Arrays doesn't have same Element!!");

    }
    static boolean cmp(int[] arr1, int[] arr2 , int n, int index)
    {
        if(n < 0) return true;
        if(!cmpElement(arr1,arr2[index],0,arr1.length - 1)) return false;
        return cmp(arr1,arr2,n - 1, index + 1);
    }
    static boolean cmpElement(int[] arr1, int target,int start, int n)
    {
        if(start > n) return false;
        if(arr1[start] == target) return true;
        return cmpElement(arr1,target,start + 1, n);
    }
}
