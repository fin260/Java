package pr1.part1;

public class Task6Harmonic {
    public static void main(String[] args) {
        System.out.println("Первые 10 членов гармонического ряда:");
        for (int n = 1; n <= 10; n++) {
            System.out.printf("1/%-2d = %.4f%n", n, 1.0 / n);
        }
    }
}
