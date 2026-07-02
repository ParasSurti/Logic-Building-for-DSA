//Count how many elements are greater than the average of the array.
package Phase_4.Level_5;

public class Q08 extends ArrayTemplate
{
    public static void main(String[] args)
    {
        Q08 q = new Q08();
        q.setup();
        q.solve();
    }
    @Override
    void solve()
    {
        int sum = sumElement(arr,n- 1,0);
        double avg =(double) sum / n;
        int num = count(arr, n - 1,avg,0);
        System.out.println("There are total '" + num + "' in a element which are greater than average !!");
    }
    static int sumElement(int[] arr, int n ,int sum)
    {
        if(n < 0) return sum;
        sum += arr[n];
        return sumElement(arr, n- 1, sum);
    }
    static int count(int[] arr,  int n,double avg, int count)
    {
        if(n < 0) return count;
        if(arr[n] > avg) count +=1 ;
        return count(arr,n -1 , avg,count);
    }
}
