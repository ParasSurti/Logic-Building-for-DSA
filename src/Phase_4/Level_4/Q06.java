//Count how many elements are common between two arrays.
package Phase_4.Level_4;

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
        int size = sizearr3(arr1,arr2,n - 1,0,0);
        System.out.println("Total common elements between two arrays : " + size);
    }
    static int sizearr3(int[] arr1, int[] arr2, int n, int index, int count)
    {
        if(n < 0) return count;
        if(common(arr1,arr2[index],arr1.length - 1))
        {
            count++;
        }
        return sizearr3(arr1, arr2,n - 1,index + 1,count);
    }

    static boolean common(int[] arr1, int target, int n)
    {
        if(n < 0) return false;
        if(arr1[n] == target)
        {
            return true;
        }
        return common(arr1,target, n - 1);
    }
}