package Java.ScannerClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        Integer age = scanner.nextInt();

        Dog dog = new Dog(name, age);
    }
}
