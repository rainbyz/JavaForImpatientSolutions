package chapter02;

/**
 * Why can’t you implement a Java method that swaps the contents of two int
 * variables? Instead, write a method that swaps the contents of two IntHolder
 * objects. (Look up this rather obscure class in the API documentation.) Can you swap
 * the contents of two Integer objects?
 */

public class Task4 {
    public static void main(String[] args) {
        /* IntHolder a = new IntHolder();
        a.value = 5;
        IntHolder b = new IntHolder();
        b.value = 9;
        System.out.printf("Before: a = %s, b = %s", a, b);
        swap(a, b);
        System.out.printf("After: a=%s, b=%s", a, b);
    }

    private static void swap(IntHolder a, IntHolder b) {
        int c = a.value;
        a.value = b.value;
        b.value = c;
    } */

    /*
    Integer is immutable (along with the other primitive wrapper types).
    BTW CORBA modules containing IntHolder were removed with JDK 11 :(
    */

    }
}
