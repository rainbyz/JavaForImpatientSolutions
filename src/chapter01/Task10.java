package chapter01;

import java.util.Random;

/**
 * Write a program that produces a random string of letters and digits by
 * generating a random long value and printing it in base 36.
 */

public class Task10 {
    public static void main(String[] args) {
        var r = new Random();
        String s = Long.toString(r.nextLong(),36);
        System.out.println(s);
    }
}
