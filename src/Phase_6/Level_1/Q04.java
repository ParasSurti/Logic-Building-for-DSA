// Print all Armstrong numbers between 1 and 1000
package Phase_6.Level_1;

public class Q04
{
    public static void main(String[] args)
    {
        print(1,1000);
    }

    static void print(int start, int end)
    {
        if(start > end) return;
        if(isArmStrong ( value(digit(start,0),0, start), start)) System.out.print(start + " ");
        print(start + 1,end);
    }

    static int digit(int start, int count)
    {
        if(start == 0) return count;
        count++;
        return digit(start / 10,count);
    }
    static boolean isArmStrong(int value, int num)
    {
        return value == num;
    }

    static int value(int digit,int sum,int num)
    {
        if(num == 0) return sum;
        sum += base(num % 10,digit,0,1);
        return value(digit,sum,num / 10);
    }

    static int base(int sum, int digit, int count, int store)
    {
        if(count >= digit) return store;
        store *= sum;
        return base(sum, digit, count + 1, store);
    }
}