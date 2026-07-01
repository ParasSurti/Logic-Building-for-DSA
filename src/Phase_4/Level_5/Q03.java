    //Find the Second-largest element in an array.
    package Phase_4.Level_5;

    public class Q03 extends ArrayTemplate
    {
        public static void main(String[] args)
        {
            Q03 q = new Q03();
            q.setup();
            q.solve();
        }
        @Override
        void solve()
        {
            int large = Math.max(arr[0],arr[1]);
            int sec = Math.min(arr[0],arr[1]);
            int largest = largest(arr,n - 1,large,sec);
            System.out.println("Second Largest Element : " + largest);
        }
        static int largest(int[] arr, int n , int large, int seclarge)
        {
            if(n < 0) return seclarge;
            if(arr[n] > large)
            {
                seclarge = large;
                large = arr[n];
            }
            else if(arr[n] > seclarge)
            {
                seclarge = arr[n];
            }
            return largest(arr,n- 1, large,seclarge);
        }

    }
