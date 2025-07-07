package Java.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        // Polimorfismo
        animal1 = new Cat();
        animal1.makeSound();

        Animal animal2 = new Dog();
        // Cast
        Dog dog = (Dog) animal2;
        dog.fetchBall();
    }
}
