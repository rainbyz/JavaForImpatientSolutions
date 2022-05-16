package chapter01;

/**
 * Write a program that prints the smallest and largest positive double value.
 * Hint: Look up Math.nextUp in the Java API.
 */

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Min positivie double value: " + Double.MIN_VALUE);
        System.out.println("Max positivie double value: " + Math.nextDown(Double.MAX_VALUE));
    }
}
