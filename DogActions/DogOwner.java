package Java.DogActions;

public class DogOwner {
    private String name;
    private Dog dog;

    public DogOwner(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public void play() {
        System.out.println("Soy " + name + " y estoy jugando con mi perro " + dog.getName());
    }

}
