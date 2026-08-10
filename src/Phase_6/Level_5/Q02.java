//Take age inputs and count how many are adults, minors, seniors.
package Phase_6.Level_5;


import java.util.Scanner;

public class Q02
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total Element in Array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }

        int minor = checkMinors(arr,n,0);
        int adult = checkAdult(arr,n,0);
        int senior = checkSenior(arr,n,0);

        System.out.println("There are total " + "\nMinor: " + minor +
                "\nAdult: " + adult
                + "\nSenior: " + senior);
    }
    static int checkMinors(int[] arr, int n, int i)
    {
        if(i >= n) return 0;
        if(arr[i] < 18) return checkMinors(arr,n,i + 1) + 1;
        return checkMinors(arr,n,i + 1);
    }
    static int checkAdult(int[] arr, int n, int i)
    {
        if(i >= n) return 0;
        if(arr[i] >= 18 && arr[i] < 60) return checkAdult(arr,n,i + 1) + 1;
        return checkAdult(arr,n,i + 1);
    }
    static int checkSenior(int[] arr, int n, int i)
    {
        if(i >= n) return 0;
        if(arr[i] >= 60) return checkSenior(arr,n,i + 1) + 1;
        return checkSenior(arr,n,i + 1);
    }
}
