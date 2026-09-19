public class Main {
    public static void main(String[] args) {
        int[] b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }

        float average = (float) sum / b.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
