package Java;

public class Base {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String name = "Anthony";
        Integer age = 31;
        Double height = 1.83;

        System.out.println("Hi, my name is " + name + " and my height is " + height);

        if (age > 15 && height >= 1.5) {
            System.out.println("You can go up");
        } else {
            System.out.println("You can't go up");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
    }
}