//Print all numbers whose sum of digits is even (1–100).
package Phase_2.Level_5;

public class Q01
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100 ; i++)
        {
                int num = i;
                int sum = 0;
                while(num != 0)
                {
                    sum += num % 10;
                    num = num / 10;
                }
                if( sum % 2 == 0)
                {
                    System.out.print(i + " ");
                }
        }
        //Second Approach
//        int num = 1;
//        //first half
//        for (int i = 1; i < 9; i++)
//        {
//            if(i  % 2 == 0)
//            {
//                System.out.print(i + " ");
//            }
//        }
//        //second half
//        for (int j = 10; j <= 100 ; j++)
//        {
//            num = j;
//            int sum = 0;
//            for (int k = 0; k < 2 ; k++) {
//                int temp = num % 10;
//                num = num / 10;
//                sum += temp;
//            }
//            if(sum % 2 == 0 && sum > 0)
//            {
//                System.out.print(j + " ");
//            }
//
//        }
    }
}
