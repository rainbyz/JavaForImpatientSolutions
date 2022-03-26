package chapter01;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        var r = new Random();
        String s = Long.toString(r.nextLong(),36);
        System.out.println(s);
    }
}
