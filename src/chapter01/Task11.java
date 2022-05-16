package chapter01;

import java.util.Scanner;

/**
 * Write a program that reads a line of text and prints all characters that are not ASCII,
 * together with their Unicode values.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String s = console.nextLine();
        isASCII(s);

    }

    private static void isASCII(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) > 127)
                System.out.println(s.charAt(i) + ", its unicode value: " + (int) s.charAt(i));
    }

    /*
    public static void checkUnicode(String s) {
        if (s == null) {
            System.out.println("s is null!");
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) == false) {
                System.out.println(s.charAt(i));
            }
        }
    }
    */
}
