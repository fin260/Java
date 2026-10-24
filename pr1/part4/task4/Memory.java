package pr1.part4.task4;

public class Memory {
    private final int sizeGb;
    private final String type;

    public Memory(int sizeGb, String type) {
        this.sizeGb = sizeGb;
        this.type = type;
    }

    public int getSizeGb() {
        return sizeGb;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return sizeGb + " ГБ " + type;
    }
}
