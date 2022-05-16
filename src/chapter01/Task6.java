package chapter01;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Write a program that computes the factorial n! = 1 × 2 × … × n,
 * using BigInteger. Compute the factorial of 1000.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BigInteger n = console.nextBigInteger();

        if (factorialCalc(n).equals(BigInteger.ZERO)) {
            System.out.println("Sorry, but n < 0");
        } else {
            System.out.println("Factorial of your number is (OMG!): \n" + factorialCalc(n));
        }
    }

    public static BigInteger factorialCalc(BigInteger n) {
        if (n.compareTo(BigInteger.ZERO) >= 0) {
            BigInteger res = BigInteger.ONE;
            for(BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
                res = res.multiply(i);
            }
            return res;
        } else {
            return BigInteger.ZERO;
        }
    }
}
