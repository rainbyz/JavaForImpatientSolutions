package chapter02;

import java.util.ArrayList;

/**
 * Can you ever have a mutator method return something other than void? Can you
 * ever have an accessor method return void? Give examples when possible.
 */

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean isElementAdded = list.add("Element");
        System.out.println(isElementAdded);

        /*
        1) add method of ArrayList class returns true if this operation was successful;
        2) probably no.
         */
    }
}
