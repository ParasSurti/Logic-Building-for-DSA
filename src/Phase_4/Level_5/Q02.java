//Check if the array is sorted in descending order.
package Phase_4.Level_5;

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
        boolean check = descending(arr,n - 1, 0);
        if(check) System.out.println("the array is sorted in Descending order.");
        else System.out.println("The array is not sorted in Descending order.");
    }
    static boolean descending(int[] arr, int n, int i)
    {
        if(i == n)
        {
            return true;
        }
        if(arr[i] < arr[i + 1]) return false;
        return descending(arr,n,i + 1);
    }
}
