//Count how many numbers between 1–500 are divisible by 7 but not by 5.
package Phase_2.Level_5;

public class Q02
{
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 500; i++)
        {
            if(i % 7 == 0 && i % 5 != 0)
            {
                count++;
            }
        }
        System.out.println( count + " numbers between 1–500 are divisible by 7 but not by 5. ");
    }
}
