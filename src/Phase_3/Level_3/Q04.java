//Print a triangle of stars recursively (bottom-up).
package Phase_3.Level_3;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();

        Triangle(n);
    }

    static void Triangle( int row) {
        if (row == 0) return;
        Triangle( row - 1);
        printStars(row);
        System.out.println();

    }

    static void printStars(int col) {
        if (col == 0) return;
        printStars(col - 1);
        System.out.print("*");
    }
}
