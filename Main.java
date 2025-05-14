package Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever = new Dog("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever,"slow");

        Dog wolf = new Dog("Wolf",40);
        doAnimalStuff(wolf,"slow");

        Fish goldie = new Fish("Goldfish", 0.25,2,3);
        doAnimalStuff(goldie,"fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();// if we call doAnimalStuff with an object of dog/fish, then makeNoise method of that dog/fish class will be called, not of animal class(polymorphism)
        animal.move(speed);// if we call doAnimalStuff with an object of dog/fish, then move method of that dog/fish class will be called, not of animal class(polymorphism)
        System.out.println(animal);// getting data from toString() method
        System.out.println("_ _ _ _");
    }
}
