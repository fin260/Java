package pr1.part1;

public class Task3ArraySum {
    public static void main(String[] args) {
        int[] arr = {4, 8, 15, 16, 23, 42};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + avg);
    }
}
