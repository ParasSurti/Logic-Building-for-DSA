//Find the difference between the largest and smallest element.
package Phase_4.Level_5;

public class Q05 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q05 q = new Q05();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        if(n < 2)
        {
            System.out.println("This Array has Insufficient Element !!");
            return;
        }
        int large = largeElement(arr,n - 1,Integer.MIN_VALUE);
        System.out.println("Largest Element : " + large);
        int small = smallElement(arr, n - 1, Integer.MAX_VALUE);
        System.out.println("Smallest Element : " + small);

        int diff = large - small;
        System.out.println("The Difference Between Largest & Smallest Element : " + diff);
    }
    static int largeElement(int[] arr, int n , int store)
    {
        if(n < 0) return store;
        store = Math.max(arr[n], store);
        return largeElement(arr, n - 1, store);
    }
    static int smallElement(int[] arr, int n , int store)
    {
        if(n < 0) return store;
        store = Math.min(arr[n], store);
        return smallElement(arr, n - 1, store);
    }
}
