package chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Write a program that prints a lottery combination, picking six distinct numbers
 * between 1 and 49. To pick six distinct numbers, start with an array list filled with 1
 * … 49. Pick a random index and remove the element. Repeat six times.
 * Print the result in sorted order.
 */

public class Task13 {
    public static void main(String[] args) {
        var loto = new ArrayList<Integer>();

        for (int i = 0; i < 49; i++) {
            loto.add(i + 1);
        }

        Random random = new Random();
        var result = new ArrayList<Integer>(6);
        for (int i = 0; i < 6; i++) {
            result.add(loto.get(random.nextInt(loto.size())));
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
