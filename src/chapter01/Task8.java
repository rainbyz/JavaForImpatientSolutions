package chapter01;

import java.util.Scanner;

/**
 * Write a program that reads a string and prints all of its nonempty substrings.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String str = console.nextLine();

        String[] arr = str.split("\\s+");
        for (String word :  arr) {
            System.out.println(word);
        }
    }
}
