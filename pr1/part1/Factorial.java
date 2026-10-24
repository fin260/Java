package pr1.part1;

public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определён");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tests = {0, 1, 5, 10, 20};
        for (int n : tests) {
            System.out.println(n + "! = " + factorial(n));
        }
    }
}
