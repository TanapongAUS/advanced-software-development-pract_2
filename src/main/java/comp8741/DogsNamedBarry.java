package comp8741;

public class DogsNamedBarry implements DogCondition {
    public boolean satisfies(Dog dog) {
        return dog.getName().equalsIgnoreCase("Barry");
    }
}
