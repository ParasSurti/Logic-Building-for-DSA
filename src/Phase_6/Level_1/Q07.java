//Print all prime numbers between 1 and N.
package Phase_6.Level_1;


import Phase_6.NumberTemplate;

public class Q07 extends NumberTemplate
{
    public static void main(String[] args) {
        Q07 q = new Q07();
        System.out.println("!! Enter the Nth Number below !!");
        q.setup();
        q.solve();
    }
    @Override
    protected void solve()
    {
          print(1,num);
    }
    static void print(int start, int end)
    {
        if(start > end) return;
        if(isPrime(start, 1, start)) System.out.print(start + " ");
        print(start +  1, end);
    }

    static boolean isPrime(int num,int start, int last)
    {
       if(start > last) return true;
       if(num == 1) return false;
       if(start != 1 && start != num && num % start == 0) return false;
       return isPrime(num,start + 1,last);
    }
}
