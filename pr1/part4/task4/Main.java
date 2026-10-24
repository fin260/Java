package pr1.part4.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Computer office = new Computer(Brand.LENOVO,
                new Processor("Intel Core i5-12400", 2.5, 6),
                new Memory(16, "DDR4"),
                new Monitor(24, "1920x1080"));
        Computer work = new Computer(Brand.APPLE,
                new Processor("Apple M2", 3.5, 8),
                new Memory(32, "LPDDR5"),
                new Monitor(27, "5120x2880"));

        office.printInfo();
        work.printInfo();
        System.out.println("Все марки: " + Arrays.toString(Brand.values()));
    }
}
