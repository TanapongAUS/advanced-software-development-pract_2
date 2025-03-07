package comp8741;

import java.util.*;

public class DogRegister {
    private List<Dog> dogList = new ArrayList<>();

    // Operational functions
    // Adds a dog to the register
    public void addDog(Dog dog) {
        dogList.add(dog);
    }

    // Returns the Dog with a registration number of
    // regNum, if it exists, otherwise returns null.
    public Dog getDog(int regNum) {
        for (Dog dog : dogList) {
            if (dog.getRegNum() == regNum) {
                return dog;
            }
        }
        return null;
    }

    // The usual toString method.
    public String toString() {
        String out = "";

        for (Dog dog : dogList) {
            out += dog.toString() + "\n";
        }

        return out;
    }

    // Returns the current dog register
    public List<Dog> getRegister() {
        return dogList;
    }

    // Removes, and returns, the Dog with a registration number of regNum
    // If there is no Dog with that registration number, null is returned.
    // Include thorough testing code in the main method.
    public Dog deleteDog(int regNum) {
        Dog deletedDog = null;

        for (Dog dog : dogList) {
            if (dog.getRegNum() == regNum) {
                deletedDog = dog;
                break;
            }
        }
        dogList.remove(deletedDog);

        return deletedDog;
    }

    // Returns a Collection<Dog> containing all the Dogs whose name contains
    // charSequence. Does not change the contents of the register.
    // Include thorough testing code in the main method.
    public Collection<Dog> getDogsWhoseNameContains(String charSequence) {
        Collection<Dog> dogs = new ArrayList<Dog>();

        for (Dog dog : dogList) {
            if (dog.getName().contains(charSequence)) {
                dogs.add(dog);
            }
        }

        return dogs;
    }

    // Re-orders (sorts) the register so that all dogs with the same breed are
    // together (that is, in sequential indexes).
    //
    // Include thorough testing code in the main method.
    public void groupByBreed() {
        Collections.sort(dogList, Comparator.comparing(Dog::getBreed));
    }

    public Collection<Dog> getByCondition(DogCondition c) {
        Collection<Dog> satisfiedDogs = new ArrayList<>();

        for (Dog dog : dogList) {
            if (c.satisfies(dog)) {
                satisfiedDogs.add(dog);
            }
        }

        return satisfiedDogs;
    }


}
