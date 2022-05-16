package chapter01;

/**
 * What happens when you cast a double to an int that is larger than the largest
 * possible int value? Try it out.
 */

public class Task5 {
    public static void main(String[] args) {
        double a = Math.nextDown(Double.MAX_VALUE);
        int b = (int) a;
        System.out.println(a + " vs " + b);
        System.out.println("a is max double value which turns into max int value with using (int)");
    }
}
