package pr1.part4.task4;

public class Computer {
    private final Brand brand;
    private final Processor processor;
    private final Memory memory;
    private final Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println("Компьютер " + brand);
        System.out.println("  Процессор: " + processor);
        System.out.println("  Память:    " + memory);
        System.out.println("  Монитор:   " + monitor);
    }
}
