package chapter01;

import java.util.Scanner;

/**
 * Write a program that reads an integer and prints it in binary, octal, and hexadecimal.
 * Print the reciprocal as a hexadecimal floating-point number.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = console.nextInt();

        System.out.println("Bunary value is: " + Integer.toBinaryString(num));
        System.out.println("Octal value is: " + Integer.toOctalString(num));
        System.out.println("Hex value is: " + Integer.toHexString(num));

        var reciprocal = 1.0 / num;
        System.out.printf("Hex floating value is: %a", reciprocal);
    }
}
