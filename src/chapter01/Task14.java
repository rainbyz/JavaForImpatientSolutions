package chapter01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that reads a two-dimensional array of integers and determines
 * whether it is a magic square (that is, whether the sum of all rows, all columns,
 * and the diagonals is the same). Accept lines of input that you break up into individual
 * integers, and stop when the user enters a blank line. For example, with the input
 * 16 3 2 13
 * 5 10 11 8
 * 9 6 7 12
 * 4 15 14 1
 * (Blank line)
 * your program should respond affirmatively.
 */

public class Task14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String str = console.nextLine();
        String[] str_arr = str.split("\\s+");
        int[][] arr = new int[str_arr.length][str_arr.length];
        for (int i = 0; i < str_arr.length; i++) {
            arr[0][i] = Integer.parseInt(str_arr[i]);
        }

        for (int i = 1; i < str_arr.length; i++) {
            for (int j = 0; j < str_arr.length; j++) {
                arr[i][j] = console.nextInt();
            }
        }

        System.out.println(System.lineSeparator() + "Given matrix is magic square? " + isMagicSquare(arr));

    }

    static boolean isMagicSquare(int[][] mat)
    {
        int N = mat.length;
        int sumd1 = 0, sumd2=0;
        for (int i = 0; i < N; i++) {
            sumd1 += mat[i][i];
            sumd2 += mat[i][N-1-i];
        }

        if(sumd1!=sumd2) return false;

        for (int i = 0; i < N; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++)
            {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
        return true;

    }
}
