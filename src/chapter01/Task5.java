package chapter01;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        double a = Math.nextDown(Double.MAX_VALUE);
        int b = (int) a;
        System.out.println(a + " vs " + b);
        System.out.println("a is max double value which turns into max int value with using (int)");
    }
}
