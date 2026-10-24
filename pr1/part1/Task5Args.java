package pr1.part1;

public class Task5Args {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не заданы");
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
