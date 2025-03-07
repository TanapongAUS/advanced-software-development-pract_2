package comp8741;

public class Wombat implements Comparable<Wombat> {
    private String name;
    private int severity;
    private double time;

    // Constructor
    public Wombat(String name, int severity, double time) throws SeverityOutOfBoundsException {
        this.name = name;
        this.severity = severity;
        this.time = time;

        if (severity < 1 || severity > 10) {
            throw new SeverityOutOfBoundsException("Severity is not within 1-10");
        }
    }

    // Getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    // Operations functions
    public String toString() {
        return getName() + ", " + getSeverity() + ", " + getTime();
    }

    public int compareTo(Wombat otherWombat) {
        int severityLevel = Integer.compare(otherWombat.severity, this.severity);

        if (otherWombat.severity == this.severity) {
            return Double.compare(this.time, otherWombat.time);
        }

        return severityLevel;
    }


}
