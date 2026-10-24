package pr1.part4.task4;

public class Processor {
    private final String model;
    private final double frequencyGHz;
    private final int cores;

    public Processor(String model, double frequencyGHz, int cores) {
        this.model = model;
        this.frequencyGHz = frequencyGHz;
        this.cores = cores;
    }

    public String getModel() {
        return model;
    }

    public double getFrequencyGHz() {
        return frequencyGHz;
    }

    public int getCores() {
        return cores;
    }

    @Override
    public String toString() {
        return model + ", " + cores + " ядер, " + frequencyGHz + " ГГц";
    }
}
