package Chapter01;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int angle = console.nextInt();
        System.out.println(normalize360(angle));
        System.out.println(normalizeFloorMod360(angle));

    }

    public static int normalize360(int n) {
        n %= 360;
        if (n < 0) {
            n = n + 360;
        }
        return n;
    }

    public static int normalizeFloorMod360(int n){
        if (n < 0) {
            return Math.floorMod(n, 360);
        } else return n;
    }
}
