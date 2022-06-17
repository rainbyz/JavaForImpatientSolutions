package chapter02;

import java.util.Random;
import java.util.Scanner;

/**
 * Consider the nextInt method of the Scanner class. Is it an accessor or mutator?
 * Why? What about the nextInt method of the Random class?
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        Random random = new Random();
        int m = random.nextInt(10);

        System.out.println(System.lineSeparator() + n);
        System.out.println(m);

        /*
        nextInt of the Scanner class is both a mutator and an accessor according to StackOverFlow;
        nextInt of the Random class is an accessor only.
        */
    }
}
