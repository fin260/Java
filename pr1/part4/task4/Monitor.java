package pr1.part4.task4;

public class Monitor {
    private final double diagonal;
    private final String resolution;

    public Monitor(double diagonal, String resolution) {
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return diagonal + " дюймов, " + resolution;
    }
}
