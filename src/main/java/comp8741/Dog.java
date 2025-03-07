package comp8741;

import java.util.HashSet;
import java.util.Set;

public class Dog {
    private String name = "unknown";
    private String breed = "unknown";
    private int regNum = -1;
    Set<String> owner;
    static int count = 0;
    private int seqNum;

    // Constructor
    public Dog() {
        owner = new HashSet<>();
        count++;
        seqNum = count;
    }

    public Dog(String name, String breed, int regNum) {
        this.name = name;
        this.breed = breed;
        this.regNum = regNum;
        owner = new HashSet<>();
        count++;
        seqNum = count;
    }

    // getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public static int getCount() {
        return count;
    }

    public static String printTotal() {
        return "Total number of dogs bred = " + count;
    }

    public Set<String> getOwners() {
        return owner;
    }

    public int getSeqNum() {
        return seqNum;
    }

    public void addOwner(String name) {
        if (!owner.contains(name)) {
            owner.add(name);
        }
    }

    // Operational functions
    public String toString() {
        String text = "Dog " + name
                + ", Breed = " + breed
                + ", #owners = " + owner.size()
                + ", Registration #: " + regNum
                + ", Sequence #: " + seqNum;
        return text;
    }

}

