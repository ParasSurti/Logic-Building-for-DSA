//Print all even numbers between 1 and 100.
package Phase_2.Level_1;

public class Q2
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }


//      Second appproach
//
//        int start = 0;
//        int last = 100;
//        for (start  = 0; start <= last; start++)
//        {
//            boolean  isEven = start % 2 == 0;
//            if(isEven)
//            {
//                System.out.println(start);
//            }
//        }
    }
}
