package comp8741;

import java.util.Collection;

public class DogBreeder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Starting dog application");

// Part-1, Task-1
        // Print string-1
//        Dog myDog = new Dog();
//        System.out.println(myDog);
//        myDog.setRegNum(3496);
//        myDog.setBreed("Poodle");
//        myDog.setName("Fluffy");
//        System.out.println(myDog);

        // Print string-2
//        Dog myDog1 = new Dog();
//        Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);
//        System.out.println(myDog1);
//        System.out.println(myDog2);

// Part-1, Task-2
        // Print string-1
//        Dog myDog1 = new Dog();
//        Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);
//        System.out.println(myDog1);
//        System.out.println(myDog2);
//
//        myDog1.setName("Fido");
//        myDog1.addOwner("Anne");
//        myDog1.addOwner("Bob");
//        myDog2.addOwner("Martha");
//        System.out.println(myDog1);
//        System.out.println(myDog2);
//        System.out.println(myDog1.getName());
//        System.out.println(myDog2.getName());

// Part-1, Task-3
        // Print string-1
//        System.out.println(Dog.printTotal());
//        Dog myDog1 = new Dog();
//        Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);
//        System.out.println(myDog1);
//        System.out.println(myDog2);
//
//        myDog1.setName("Fido");
//        myDog1.addOwner("Anne");
//        myDog1.addOwner("Bob");
//        myDog2.addOwner("Martha");
//        System.out.println(myDog1);
//        System.out.println(myDog1.getName());
//        System.out.println(myDog2.getName());
//        System.out.println(Dog.printTotal());

// Part-1, Task-4
        // Print string-1
//        DogRegister dogList = new DogRegister();

//        Dog myDog3 = new Dog("A", "Chiwawa", 1111);
//        Dog myDog4 = new Dog("B", "Poodle", 2222);
//        Dog myDog5 = new Dog("C", "Greyhound", 3333);
//        Dog myDog6 = new Dog("D", "Yorkshire Terrier", 4444);
//        Dog myDog7 = new Dog("A", "Siberian Husky", 6666);
//        Dog myDog8 = new Dog("A", "Beagle", 7777);
//        dogList.addDog(myDog3);
//        dogList.addDog(myDog4);
//        dogList.addDog(myDog5);
//        dogList.addDog(myDog6);
//        dogList.addDog(myDog7);
//        dogList.addDog(myDog8);

        // Checking methods
//        System.out.println("dogList -> getDog");
//        System.out.println(dogList.getDog(1111));
//        System.out.println(dogList.getDog(4444));
//        System.out.println(dogList.getDog(5555) + "\n");
//
//        System.out.println("dogList -> toString");
//        System.out.println(dogList.toString());
//
//        System.out.println("dogList -> getRegister");
//        System.out.println(dogList.getRegister() + "\n");
//
//        System.out.println("dogList -> deleteDog() with regNum = 1111");
//        dogList.deleteDog(1111);
//        System.out.println(dogList.toString());
//
//        System.out.println("dogList -> getDogsWhoseNameContains() with the owner name = A");
//        System.out.println(dogList.getDogsWhoseNameContains("A"));

// Part-1, Task-5
        // Print string-1
        DogRegister dogList = new DogRegister();
        Dog myDog1 = new Dog("A", "Poodle", 1111);
        Dog myDog2 = new Dog("Barry", "Chiwawa", 2222);
        Dog myDog3 = new Dog("C", "Poodle", 3333);
        Dog myDog4 = new Dog("D", "Greyhound", 4444);
        Dog myDog5 = new Dog("E", "Poodle", 5555);
        Dog myDog6 = new Dog("Barry", "Greyhound", 6666);
        dogList.addDog(myDog1);
        dogList.addDog(myDog2);
        dogList.addDog(myDog3);
        dogList.addDog(myDog4);
        dogList.addDog(myDog5);
        dogList.addDog(myDog6);

        // Checking methods
        System.out.println("dogList -> groupByBreed()");
        dogList.groupByBreed();
        System.out.println(dogList.toString());

        System.out.println("dg -> getByCondition(DogCondition c)");
        DogRegister dg = new DogRegister();
        dg.addDog(myDog1);
        dg.addDog(myDog2);
        dg.addDog(myDog3);
        dg.addDog(myDog4);
        dg.addDog(myDog5);
        dg.addDog(myDog6);

        DogCondition dc = new DogsNamedBarry(); // satisfies is true for dogs named Barry
        Collection<Dog> dogsNamedBarry = dg.getByCondition(dc);
        System.out.println(dogsNamedBarry);


        // End of the main method
    }
}
