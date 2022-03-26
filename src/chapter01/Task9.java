package chapter01;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String s = console.nextLine();
        String t = console.nextLine();

        System.out.println(stringsCompare(s, t));
    }

    public static boolean stringsCompare(String s, String t) {
        boolean flag = false;
        int count = 0;
        if (s.length() == t.length()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(i)) {
                    count++;
                }
            }
            if (count == s.length()) flag = true;
        }
        return flag;
    }
}
