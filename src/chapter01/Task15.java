package chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task15 {

    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        var all_rows = new ArrayList<ArrayList<Integer>>();
        var row = new ArrayList<Integer>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);

            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }

            all_rows.add(new ArrayList<>(row));
        }

        return all_rows;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        ArrayList<ArrayList<Integer>> result = generate(n);

        for (ArrayList<Integer> current : result) {
            System.out.println(Arrays.toString(current.toArray()));
        }
    }
}
