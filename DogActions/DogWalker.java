package Java.DogActions;

public class DogWalker {
    private String name;

    public DogWalker(String name) {
        this.name = name;
    }

    public void walkDog(Dog dog) {
        System.out.println("Soy " + name + " y estoy paseando al perro " + dog.getName());
    }
}
