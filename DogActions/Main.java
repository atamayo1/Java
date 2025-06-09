package Java.DogActions;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky");
        Dog anotherDog = new Dog("Ayudante de santa");

        DogOwner dogOwner = new DogOwner("Anthony", dog);

        dogOwner.play();

        DogWalker dogWalker = new DogWalker("Aura Maria");

        dogWalker.walkDog(dog);
        dogWalker.walkDog(anotherDog);
    }
}
