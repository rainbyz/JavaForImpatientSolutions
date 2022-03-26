package chapter01;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        System.out.print("1st way to find max: ");
        findMax(a, b, c);

        System.out.printf("2nd way to find max: %d", Math.max(a, Math.max(b, c)));
    }

    public static void findMax(int a, int b, int c) {
        if (a < b) {
            if (b < c) System.out.println(c);
            else System.out.print(b);
        } else {
            if (a > c) System.out.println(a);
            else System.out.print(c);
        }
    }
}
