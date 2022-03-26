package chapter01;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        int number, sum = 0;
        Scanner input = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            number = input.nextInt();

            if (number > 0.0) sum += number;
            else flag = false;
        }

        System.out.println("Sum: " + sum);
    }
}
