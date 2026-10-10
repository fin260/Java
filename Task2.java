import java.util.Scanner;
 
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n;
        do {
            System.out.print("Введите размер массива (больше 0): ");
            n = sc.nextInt();
        } while (n <= 0);
 
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
 
        int sumWhile = 0;
        int i = 0;
        while (i < n) {
            sumWhile += a[i];
            i++;
        }
 
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += a[j];
            j++;
        } while (j < n);
 
        int max = a[0];
        int min = a[0];
        for (int k = 1; k < n; k++) {
            if (a[k] > max) {
                max = a[k];
            }
            if (a[k] < min) {
                min = a[k];
            }
        }
 
        System.out.println("Сумма (цикл while): " + sumWhile);
        System.out.println("Сумма (цикл do while): " + sumDoWhile);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}

