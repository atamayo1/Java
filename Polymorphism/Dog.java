package Java.Polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("WOOF WOOF");
    }

    public void fetchBall() {
        System.out.println("estoy buscando la pelota");
        makeSound();
    }
}
