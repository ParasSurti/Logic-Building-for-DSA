//Count how many times a coin lands on heads/tails (use random).
package Phase_6.Level_5;

import java.util.Scanner;
import java.util.Random;

public class Q05
{
    public static void main(String[] args)
    {
        System.out.println("Rules : {0 : Head},{1 : Tail}");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of coin flips : ");
        int n = input.nextInt();

        Random random = new Random();
        int result;
        int countHeads = 0;
        int countTails = 0;
        for (int i = 0; i < n ; i++)
        {
            result = random.nextInt(0,2);
            if(result == 0){
                countHeads++;
            }
            else
            {
                countTails++;
            }
        }
        System.out.println("Total Heads : "+ countHeads);
        System.out.println("Total Tails : "+ countTails);
    }
}
