package chapter01;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        short a = console.nextShort();
        short b = console.nextShort();

        System.out.println("Sum: " + (Short.toUnsignedInt(a) + Short.toUnsignedInt(b)));
        System.out.println("Difference: " + (Short.toUnsignedInt(a) - Short.toUnsignedInt(b)));
        System.out.println("Product: " + (Short.toUnsignedInt(a) * Short.toUnsignedInt(b)));
        System.out.println("Quotient: " + (Short.toUnsignedInt(a) / Short.toUnsignedInt(b)));
        System.out.println("Remainder: " + (Short.toUnsignedInt(a) % Short.toUnsignedInt(b)));

    }
}
