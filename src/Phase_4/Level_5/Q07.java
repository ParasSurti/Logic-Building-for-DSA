//Count how many pairs of elements have a sum equal to a given number k.
package Phase_4.Level_5;

public class Q07 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q07 q = new Q07();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        System.out.print("Enter the target : ");
        int k = input.nextInt();
        int count = 0;
        int combine = pair1(arr,n - 1,k);
        System.out.println("Total pair : "+ combine);

    }
    static int pair1(int[] arr, int n, int k)
    {
        if(n < 0) return 0;
        return pair1(arr, n - 1, k) + pair2(arr,n,k,0,n + 1);
    }
    static int pair2(int[]arr, int n , int k, int count, int index)
    {
        if(index > arr.length - 1) return count;
        System.out.println("n : " + arr[n] + ", index :" + arr[index] + ", sum : " + (arr[n] + arr[index]) );
        if(arr[n] + arr[index] == k) count+=1;
        return pair2(arr, n,k,count,index + 1);
    }


}
