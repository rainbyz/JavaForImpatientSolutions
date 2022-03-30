package chapter01;

public class Task16 {
    public static void main(String[] args) {
        System.out.println(average(5));
    }

    public static double average(double first, double... rest) {
        var result = first;
        for (var value : rest) {
            result += value;
        }
        return rest.length == 0? first : result / (rest.length + 1);
    }
}
