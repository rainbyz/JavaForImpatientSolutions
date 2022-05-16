package chapter01;

import java.util.Scanner;

/**
 * The Java Development Kit includes a file src.zip with the source code of the
 * Java library. Unzip and, with your favorite text search tool, find usages of the
 * labeled break and continue sequences.
 * Take one and rewrite it without a labeled statement.
 */

public class Task12 {
    public static void main(String[] args) {

        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            number = input.nextInt();

            if (number > 0.0) sum += number;
            else flag = false;
        }

        System.out.println("Sum: " + sum);
    }
}
