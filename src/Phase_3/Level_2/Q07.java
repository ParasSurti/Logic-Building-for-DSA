//Print digits of a number in words recursively (e.g., 123 → “one two three”).
package Phase_3.Level_2;

import java.util.Scanner;

public class Q07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        printwords(num);
    }
    static void printwords(int num)
    {
        if(num == 0) return;

        printwords(num / 10);

        int number = num % 10;
        switch (number) {
            case 0:
                System.out.println("zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2 :
                System.out.print("two ");
                break;
            case 3 :
                System.out.print("three ");
                break;
            case 4 :
                System.out.print("four ");
                break;
            case 5 :
                System.out.print("five ");
                break;
            case 6 :
                System.out.print("six ");
                break;
            case 7 :
                System.out.print("seven ");
                break;
            case 8 :
                System.out.print("eight ");
                break;
            case 9 :
                System.out.print("nine ");
                break;
        }
    }
}
