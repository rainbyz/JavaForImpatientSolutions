package chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        var loto = new ArrayList<Integer>();

        for (int i = 0; i < 49; i++) {
            loto.add(i + 1);
        }

        Random random = new Random();
        var result = new ArrayList<Integer>(6);
        for (int i = 0; i < 6; i++) {
            result.add(loto.get(random.nextInt(loto.size())));
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
