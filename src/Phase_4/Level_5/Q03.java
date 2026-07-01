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
            if (n < 2)
            {
                System.out.println("Second largest element does not exist.");
                return;
            }
            int[] arr2 = new int[n];
            int large = newArr2(arr,arr2,n - 1,Integer.MIN_VALUE);
            int result = largest(arr2,n - 1,large,Integer.MIN_VALUE);
            if(result == Integer.MIN_VALUE)
            {
                System.out.println("Second largest element does not exist.");
            }
            else
            {
                System.out.println("Second Largest Element : " + result);
            }
        }
        static int newArr2(int[] arr, int[] arr2, int n , int large)
        {
            if(n < 0) return large;
            arr2[n] = arr[n];
            large = Math.max(arr[n],large);
            return newArr2(arr,arr2, n - 1, large);
        }

        static int largest(int[] arr2,int n, int large, int sec)
        {
            if(n < 0) return sec;
            if(arr2[n] == large)
            {
                arr2[n] = Integer.MIN_VALUE;
            }
            sec = Math.max(arr2[n],sec);
            return largest(arr2,n - 1, large,sec);
        }
    }
